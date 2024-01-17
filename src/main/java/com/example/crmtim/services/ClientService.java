package com.example.crmtim.services;

import com.example.crmtim.models.Client;
import com.example.crmtim.repositories.ClientPerository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class ClientService {
    private final ClientPerository clientPerository;
    private List<Client> clients = new ArrayList<>();

    public List<Client> listClients(String firstName) {
        if (firstName != null) return clientPerository.findByFirstName(firstName);
        return clientPerository.findAll();
    }

    public void saveClient(Client client) {
        log.info("Saving new {}", client);
        clientPerository.save(client);
    }

    public void deleteClient(Long id) {
        clientPerository.deleteById(id);
    }

    public Client getClientById(Long id) {
        return clientPerository.findById(id).orElse(null);

    }
}
