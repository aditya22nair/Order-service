package com.example.OrderService.repository;

import com.example.OrderService.entity.Orders;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface OrderRepository extends MongoRepository<Orders,String> {

    List<Orders> findByUserId(String userId);

    List<Orders> findByUserIdOrderByDateDesc(String userId);
}
