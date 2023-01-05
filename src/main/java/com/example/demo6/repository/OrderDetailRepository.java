package com.example.demo6.repository;

import com.example.demo6.entity.mongo.OrderDetail;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

public interface OrderDetailRepository extends MongoRepository<OrderDetail, Integer> {
}
