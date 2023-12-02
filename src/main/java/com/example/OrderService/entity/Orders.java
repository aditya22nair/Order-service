package com.example.OrderService.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Document(collection = "Orders")
@Data
public class Orders {
    private String orderId;
    private String userId;
    private List<String> productIds;
    private String merchantId;
    private Date date;
    private double totalAmount;

}
