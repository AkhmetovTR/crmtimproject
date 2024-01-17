package com.example.crmtim.services;

import com.example.crmtim.models.Client;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClientService {
    private List <Client> clients = new ArrayList<>();
    private long ID = 0;
    {
        clients.add(new Client(++ID,"Akhmetov","Timur","+7999999999"));
        clients.add(new Client(++ID,"Akhmetova","Ekaterina","+7999999955"));
    }
  public List<Client> listClients(){
        return clients;
  }
  public void saveClient(Client client){
        client.setId(++ID);
        clients.add(client);
  }
  public void deleteClient(Long id){
        clients.removeIf(client -> client.getId().equals(id));
  }

}
