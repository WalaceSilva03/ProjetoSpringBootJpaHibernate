package com.testespringvscode.projetoitens.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.testespringvscode.projetoitens.entities.Order;
import com.testespringvscode.projetoitens.entities.User;
import com.testespringvscode.projetoitens.entities.entitiesEnuns.OrderStatus;
import com.testespringvscode.projetoitens.repositories.OrderRepository;
import com.testespringvscode.projetoitens.repositories.UserRepository;

@Configuration
@Profile("test") // Roda essa configuração apenas no perfil de teste que foi configurado em
                 // properties.
public class TestConfig implements CommandLineRunner {

    @Autowired // Resolve a dependência e associa o User repository com User
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void run(String... args) throws Exception {

        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");

        Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.WAITING_PAYMENT, u1);
        Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.CANCELED, u2);
        Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.DELIVERED, u1);

        userRepository.saveAll(Arrays.asList(u1, u2)); // Salva o User 1 e User 2 no banco em forma de lista.
        orderRepository.saveAll(Arrays.asList(o1, o2, o3));

    }
}
// Primeiro caso de injeção de dependência, a classe teste precisa acessar o
// repository para popular o banco de dados
// O test Config implementa CommandLineRunner para acontecer algo assim que o
// programa rodar. O método Run instância dois Users.
