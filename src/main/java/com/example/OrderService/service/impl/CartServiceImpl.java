package com.example.OrderService.service.impl;

import com.example.OrderService.dto.CartDto;
import com.example.OrderService.entity.Cart;
import com.example.OrderService.entity.Orders;
import com.example.OrderService.repository.CartRepository;
import com.example.OrderService.service.CartService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Service
public class CartServiceImpl implements CartService {

    @Autowired
    private CartRepository cartRepository;

    @Override
    public boolean addToCart(CartDto cartDto) {
        Cart cart = new Cart();
        BeanUtils.copyProperties(cartDto,cart);
        cart.setCartId(UUID.randomUUID().toString());
        Cart savedCart = cartRepository.save(cart);
        return Objects.nonNull(savedCart);
    }

    @Override
    public List<Cart> getCart() {
        List<Cart> carts = cartRepository.findAll();
        return carts;
    }

    @Override
    public List<Cart> getCartByUserId(String userId) {
        return cartRepository.findByUserId(userId);
    }

    @Override
    public void deleteByUserId(String userId) {
        cartRepository.deleteByUserId(userId);
    }

    @Override
    public boolean deleteByUserIdAndProductId(String userId, String productId) {
        return cartRepository.deleteByUserIdAndProductId(userId,productId);
    }
}
