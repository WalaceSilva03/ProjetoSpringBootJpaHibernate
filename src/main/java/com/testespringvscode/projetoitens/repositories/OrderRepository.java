package com.testespringvscode.projetoitens.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testespringvscode.projetoitens.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
    
}
