package com.example.OrderService.dto;

import lombok.Data;

@Data
public class CartDto {
    private String userId;
    private double quantity;
    private String productId;
    private String merchantId;
}
