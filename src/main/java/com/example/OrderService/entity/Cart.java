package com.example.OrderService.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Cart")
@Data
public class Cart {
    private String cartId;
    private String userId;
    private double quantity;
    private String productId;
    private String merchantId;
}
