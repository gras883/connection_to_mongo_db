package com.example.demo6.repository;

import com.example.demo6.entity.oms.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {

    @Override
    Order getById(Integer id);

    @Override
    Order save(Order order);

}
