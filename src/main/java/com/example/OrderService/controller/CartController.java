package com.example.OrderService.controller;

import com.example.OrderService.dto.CartDto;
import com.example.OrderService.entity.Cart;
import com.example.OrderService.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cart")
public class CartController {

    @Autowired
    private CartService cartService;

    @PostMapping("/add")
    public boolean addCart(@RequestBody CartDto cartDto){

        return cartService.addToCart(cartDto);

    }

    @GetMapping
    public List<Cart> getCart(){
        return cartService.getCart();
    }

    @GetMapping("/user/{userId}")
    public List<Cart> getCartByUserId(@PathVariable String userId) {
        return cartService.getCartByUserId(userId);
    }

    @DeleteMapping("/{userId}")
    public boolean deleteCartByUserId(@PathVariable String userId){
        try {
            cartService.deleteByUserId(userId);
            return true;
        }
        catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }

    @DeleteMapping("/{userId}/{productId}")
    public boolean deleteCartByUserIdandProductId(@PathVariable String userId,String productId){
        try {
            cartService.deleteByUserIdAndProductId(userId,productId);
            return true;
        }
        catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }
}
