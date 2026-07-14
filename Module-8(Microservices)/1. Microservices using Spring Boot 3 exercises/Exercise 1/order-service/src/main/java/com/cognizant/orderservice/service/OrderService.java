package com.cognizant.orderservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.cognizant.orderservice.model.Order;
import com.cognizant.orderservice.repository.OrderRepository;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    @Autowired
    private WebClient webClient;

    public List<Order> getAllOrders() {
        return repository.findAll();
    }

    public Order saveOrder(Order order) {

        webClient.get()
                .uri("http://localhost:8081/users")
                .retrieve()
                .bodyToMono(String.class)
                .block();

        return repository.save(order);
    }
}