package com.example.crmtim.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthentificationController {
    @GetMapping("/authentification")
    public String login(){
        return "authentification";
    }
}
