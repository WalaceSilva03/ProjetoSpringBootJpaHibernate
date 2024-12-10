package com.testespringvscode.projetoitens.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testespringvscode.projetoitens.entities.Product;
import com.testespringvscode.projetoitens.repositories.ProductRepository;

@Service // Registra como um service do Spring e da a permissão para ser injetado.
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll(){
        return productRepository.findAll();
    }

    public Product findById(Long id){
        Optional<Product> obj = productRepository.findById(id);
        return obj.get();
    }
    
}
