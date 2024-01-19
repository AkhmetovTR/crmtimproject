package com.example.crmtim.services;

import com.example.crmtim.models.Client;
import com.example.crmtim.repositories.ClientRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class ClientService {
    private final ClientRepository clientRepository;
    private List<Client> clients = new ArrayList<>();

    public List<Client> listClients(String firstName) {
        if (firstName != null) return clientRepository.findByFirstName(firstName);
        return clientRepository.findAll();
    }

    public void saveClient(Client client) {
        log.info("Saving new {}", client);
        clientRepository.save(client);
    }

    public void deleteClient(Long id) {
        clientRepository.deleteById(id);
    }

    public Client getClientById(Long id) {
        return clientRepository.findById(id).orElse(null);

    }
}
