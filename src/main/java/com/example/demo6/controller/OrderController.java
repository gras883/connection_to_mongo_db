package com.example.demo6.controller;

import com.example.demo6.entity.Rest.OrderRequest;
import com.example.demo6.entity.oms.Order;
import com.example.demo6.service.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @Autowired
    OrderServiceImpl orderService;

    @PostMapping("/createOrder")
    public Order createOrder(@RequestBody OrderRequest orderRequest){
        return orderService.execute(orderRequest);
    }
}
