package com.testespringvscode.projetoitens.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testespringvscode.projetoitens.entities.User;
import com.testespringvscode.projetoitens.repositories.UserRepository;

@Service // Registra como um service do Spring e da a permissão para ser injetado.
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public User findById(Long id){
        Optional<User> obj = userRepository.findById(id);
        return obj.get();
    }
    
}
