package com.example.OrderService.service;

import com.example.OrderService.dto.CartDto;
import com.example.OrderService.dto.OrdersDto;
import com.example.OrderService.entity.Cart;
import com.example.OrderService.entity.Orders;

import java.util.List;

public interface CartService {
    boolean addToCart(CartDto cartDto);

    List<Cart> getCart();

    List<Cart> getCartByUserId(String cartId);

    void deleteByUserId(String userId);

    boolean deleteByUserIdAndProductId(String userId,String productId);
}
