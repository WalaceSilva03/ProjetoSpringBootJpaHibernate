package com.testespringvscode.projetoitens.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testespringvscode.projetoitens.repositories.CategoryRepository;

@Service // Registra como um service do Spring e da a permissão para ser injetado.
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<com.testespringvscode.projetoitens.entities.Category> findAll(){
        return categoryRepository.findAll();
    }

    public com.testespringvscode.projetoitens.entities.Category findById(Long id){
        Optional<com.testespringvscode.projetoitens.entities.Category> obj = categoryRepository.findById(id);
        return obj.get();
    }
    
}
