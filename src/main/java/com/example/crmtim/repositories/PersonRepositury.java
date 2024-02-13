package com.example.crmtim.repositories;

import com.example.crmtim.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PersonRepositury extends JpaRepository<Person, Integer> {
Optional<Person> findByLogin(String login);
}
