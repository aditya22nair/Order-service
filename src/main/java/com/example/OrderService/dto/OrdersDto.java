package com.example.OrderService.dto;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class OrdersDto {
    private String userId;
    private List<String> productIds;
    private String merchantId;
    private Date date;
    private double totalAmount;
}
