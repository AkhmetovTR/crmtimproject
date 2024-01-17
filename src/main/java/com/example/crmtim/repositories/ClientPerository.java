package com.example.crmtim.repositories;

import com.example.crmtim.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClientPerository extends JpaRepository<Client, Long> {
    List<Client> findByFirstName(String firstName);
}
