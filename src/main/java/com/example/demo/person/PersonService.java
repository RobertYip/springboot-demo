package com.example.demo.person;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    public List<Person> getPersons(){
        return List.of(
                new Person(1, "Bob",25,  "bob.b@gmail.com"),
                new Person(2, "Tim,",30,  "tim.t@gmail.com")
        );

    }
}
