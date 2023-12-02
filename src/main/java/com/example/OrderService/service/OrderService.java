package com.example.OrderService.service;

import com.example.OrderService.dto.OrdersDto;
import com.example.OrderService.entity.Orders;

import java.util.List;

public interface OrderService {

    boolean addOrder(OrdersDto ordersDto);

    List<Orders> getAllOrders();

    List<Orders> getOrderByUserId(String userId);

    List<Orders> getOrderByUserIdOrderByDate(String userId);


}
