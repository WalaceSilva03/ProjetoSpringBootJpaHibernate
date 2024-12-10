package com.testespringvscode.projetoitens.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testespringvscode.projetoitens.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    
}
