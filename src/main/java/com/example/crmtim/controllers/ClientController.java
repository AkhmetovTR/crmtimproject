package com.example.crmtim.controllers;

import com.example.crmtim.models.Client;
import com.example.crmtim.services.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class ClientController {
    private final ClientService clientService;
    @GetMapping("/")
    public String clients(@RequestParam(name = "fisrtName", required = false)  String firstName, Model model){
        model.addAttribute("clients",clientService.listClients(firstName));
        return "clients";
    }
    @GetMapping("/client/info/{id}")
    public String clientInfo(@PathVariable Long id, Model model){
        model.addAttribute("client",clientService.getClientById(id));
        return "client-info";
    }

    @PostMapping("/client/add")
    public String createClient(Client client){
        clientService.saveClient(client);
        return "redirect:/";

    }
    @PostMapping("/client/delete/{id}")
    public String deleteClient(@PathVariable Long id){
    clientService.deleteClient(id);
        return "redirect:/";
    }
}
