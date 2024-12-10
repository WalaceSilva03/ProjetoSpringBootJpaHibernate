package com.testespringvscode.projetoitens.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testespringvscode.projetoitens.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    
}
