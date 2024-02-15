package com.example.crmtim.services;

import com.example.crmtim.models.Person;
import com.example.crmtim.repositories.PersonRepositury;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class PersonService {
    private final PersonRepositury personRepositury;

    @Autowired
    public PersonService(PersonRepositury personRepositury) {
        this.personRepositury = personRepositury;
    }
    public Person findByLogin(Person person){
        Optional<Person> person_db = personRepositury.findByLogin(person.getLogin());
        return person_db.orElse(null);
    }
    @Transactional
    public void register(Person person){
        personRepositury.save(person);
    }

}
