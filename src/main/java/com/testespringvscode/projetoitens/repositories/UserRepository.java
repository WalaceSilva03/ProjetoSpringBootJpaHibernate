package com.testespringvscode.projetoitens.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.testespringvscode.projetoitens.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
