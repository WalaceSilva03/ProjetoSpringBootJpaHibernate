package com.testespringvscode.projetoitens.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import com.testespringvscode.projetoitens.entities.User;

import com.testespringvscode.projetoitens.repositories.UserRepository;

@Configuration
@Profile("test") //Roda essa configuração apenas no perfil de teste que foi configurado em properties.
public class TestConfig implements CommandLineRunner {

    @Autowired //Resolve a dependência e associa o User repository com User
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");

        userRepository.saveAll(Arrays.asList(u1, u2)); // Salva o User 1 e User 2 no banco em forma de lista.

    }
}
// Primeiro caso de injeção de dependência, a classe teste precisa acessar o repository para popular o banco de dados
//O test Config implementa CommandLineRunner para acontecer algo assim que o programa rodar. O método Run instância dois Users.
