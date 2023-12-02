package com.example.OrderService.controller;

import com.example.OrderService.dto.OrdersDto;
import com.example.OrderService.entity.Orders;
import com.example.OrderService.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping("/add")
    public boolean addOrders(@RequestBody OrdersDto ordersDto){

        return orderService.addOrder(ordersDto);

    }

    @GetMapping
    public List<Orders> getOrders(){
        return orderService.getAllOrders();
    }

    @GetMapping("/user/{userId}")
    public List<Orders> getOrdersByUserId(@PathVariable String userId) {
        return orderService.getOrderByUserIdOrderByDate(userId);
    }
}
