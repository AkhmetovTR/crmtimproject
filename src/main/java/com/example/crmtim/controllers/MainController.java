package com.example.crmtim.controllers;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.GetMapping;

public class MainController {
    public int ID = 1;
    public int numberOfLoginsToTheSite = 1;
    @GetMapping("/")
    //принимаем обьект http запроса далее вытянули сессию конкретного пользователя
    public void index(HttpServletRequest request){
        HttpSession session = request.getSession();
        Integer numberOfLoginsToTheSiteSession = (Integer) session.getAttribute("numberOfLoginsToTheSite");
        Integer id = (Integer) session.getAttribute("id");
        if(numberOfLoginsToTheSiteSession == null){
            session.setAttribute("numberOfLoginsToTheSite", numberOfLoginsToTheSite);
            numberOfLoginsToTheSiteSession++;
        } else {
            session.setAttribute("numberOfLoginsToTheSite",numberOfLoginsToTheSite++);
        }

        if (id == null){
            session.setAttribute("id", ID);
        }

    }
}
