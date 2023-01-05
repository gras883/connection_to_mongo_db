package com.example.demo6.service;

import com.example.demo6.constants.OrderStatus;
import com.example.demo6.constants.OrderType;
import com.example.demo6.entity.Rest.OrderRequest;
import com.example.demo6.entity.mongo.DatabaseSequence;
import com.example.demo6.entity.mongo.OrderDetail;
import com.example.demo6.entity.oms.Order;
import com.example.demo6.repository.OrderDetailRepository;
import com.example.demo6.repository.OrderRepository;
import org.hibernate.sql.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class OrderServiceImpl {

    @Autowired
    OrderRepository orderRepository;

    @Autowired
    OrderDetailRepository orderDetailRepository;
    @Autowired
    SequenceServiceGenerator sequenceServiceGenerator;
    public Order execute(OrderRequest orderRequest) {
        OrderStatus status = OrderStatus.Completed;
        if(orderRequest.getOrderType() == OrderType.BUS){
            status = OrderStatus.Failed;
        }
        System.out.println("HELLO !!!!!!!!");
        Order order = Order
                .builder()
                .status(status)
                .orderType(orderRequest.getOrderType())
                .build();
        orderRepository.save(order);

        OrderDetail orderDetail = OrderDetail.builder()
                .id(sequenceServiceGenerator.generateSequence(OrderDetail.SEQUENCE_NAME))
                .orderId(order.getOrderId())
                .order(order)
                .build();
        orderDetailRepository.save(orderDetail);

        System.out.println(orderDetail.getId());
        return order;
    }


}
