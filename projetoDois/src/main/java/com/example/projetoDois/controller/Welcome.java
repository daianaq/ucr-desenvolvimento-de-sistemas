package com.example.projetoDois.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {

    @GetMapping("/")
    public String a(){
        return "Olá";
    }

    @GetMapping("/dev")
    public String dev(){
        return "Desenvolvido por: Daiana";
    }
}