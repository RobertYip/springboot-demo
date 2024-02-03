package com.example.demo.person;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/person")
public class PersonController {
    private final PersonService personService;

    public PersonController(){
        this.personService = new PersonService();
    }
    @GetMapping
    public List<Person> getPersons(){
        return personService.getPersons();
    }
}
