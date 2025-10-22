package com.example.projetoUm.controller;

import com.example.projetoUm.model.ClienteModel;
import com.example.projetoUm.repository.ClienteRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    private ClienteRepository clienteRepository;

    public ClienteController(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @GetMapping
    public List<ClienteModel> list(){
        return clienteRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<ClienteModel> salvar(@RequestBody ClienteModel cliente){
        clienteRepository.save(cliente);
        return ResponseEntity.status(HttpStatus.CREATED).body(cliente);
    }

}