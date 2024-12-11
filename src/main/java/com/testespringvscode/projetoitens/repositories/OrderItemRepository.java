package com.testespringvscode.projetoitens.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testespringvscode.projetoitens.entities.OrderItem;
import com.testespringvscode.projetoitens.entities.entitiesPK.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
    
}
