package com.example.projetoDois.controller;

import com.example.projetoDois.model.ClienteModel;
import com.example.projetoDois.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping
    public List<ClienteModel> listarTodos(){
        return clienteRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<ClienteModel> salvar(@RequestBody ClienteModel clienteModel){
        clienteRepository.save(clienteModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(clienteModel);
    }
}
