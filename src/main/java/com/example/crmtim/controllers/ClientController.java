package com.example.crmtim.controllers;

import com.example.crmtim.services.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class ClientController {
    private final ClientService clientService;
    @GetMapping("/")
    public String clients(Model model){
        model.addAttribute("clients",clientService.listClients());
        return "clients";
    }
}
