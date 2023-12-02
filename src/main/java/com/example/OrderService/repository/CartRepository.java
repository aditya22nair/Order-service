package com.example.OrderService.repository;

import com.example.OrderService.entity.Cart;
import com.example.OrderService.entity.Orders;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CartRepository extends MongoRepository<Cart,String> {
    List<Cart> findByUserId(String userId);

    void deleteByUserId(String userId);

    boolean deleteByUserIdAndProductId(String userId, String cartId);
}
