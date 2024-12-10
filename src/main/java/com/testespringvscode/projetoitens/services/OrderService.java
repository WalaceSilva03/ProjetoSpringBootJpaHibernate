package com.testespringvscode.projetoitens.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testespringvscode.projetoitens.entities.Order;
import com.testespringvscode.projetoitens.repositories.OrderRepository;

@Service // Registra como um service do Spring e da a permissão para ser injetado.
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> findAll(){
        return orderRepository.findAll();
    }

    public Order findById(Long id){
        Optional<Order> obj = orderRepository.findById(id);
        return obj.get();
    }
    
}
