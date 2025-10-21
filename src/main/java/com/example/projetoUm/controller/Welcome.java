package com.example.projetoUm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Welcome {

    @GetMapping("/")

    public String mensagem(){
        return "Bem-Vindo!";
    }

    @GetMapping("/dev")
    public String dev() {
        return "Desenvolvedora: Daiana";
    }

    @GetMapping("/dev/curso")
    public String curso() {
        return "Curso: Desenvolvimento de Sistemas";
    }

    @GetMapping("/dev/contato")
    public String contato() {
        return "E-mail: daianafreitas237@gmail.com";
    }
}