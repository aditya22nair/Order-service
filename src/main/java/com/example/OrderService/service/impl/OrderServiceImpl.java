package com.example.OrderService.service.impl;

import com.example.OrderService.dto.OrdersDto;
import com.example.OrderService.entity.Orders;
import com.example.OrderService.repository.OrderRepository;
import com.example.OrderService.service.OrderService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public boolean addOrder(OrdersDto ordersDto) {
        Orders orders = new Orders();
        BeanUtils.copyProperties(ordersDto,orders);
        orders.setOrderId(UUID.randomUUID().toString());
        Orders savedOrders = orderRepository.save(orders);
        return Objects.nonNull(savedOrders);
    }

    @Override
    public List<Orders> getAllOrders() {
        List<Orders> orders = orderRepository.findAll();
        return orders;
    }

    @Override
    public List<Orders> getOrderByUserId(String userId) {
        return orderRepository.findByUserId(userId);
    }

    @Override
    public List<Orders> getOrderByUserIdOrderByDate(String userId) {
        return orderRepository.findByUserIdOrderByDateDesc(userId);
    }
}
