package com.example.demo.person;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class PersonConfig {
    @Bean
    CommandLineRunner commandLineRunner(PersonRepository personRepository){
        return args->{
            Person bob = new Person("Bob",25,  "bob.b@gmail.com");
            Person tim = new Person("Tim",30,  "tim.t@gmail.com");
            personRepository.saveAll(
                    List.of(bob, tim)
            );
        };
    }
}
