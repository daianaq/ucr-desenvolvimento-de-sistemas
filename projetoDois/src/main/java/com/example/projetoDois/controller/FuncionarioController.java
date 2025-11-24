package com.example.projetoDois.controller;

import com.example.projetoDois.model.FuncionarioModel;
import com.example.projetoDois.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    @GetMapping
    public List<FuncionarioModel> listarTodos(){
        return funcionarioRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<FuncionarioModel> salvar(@RequestBody FuncionarioModel funcionarioModel){
        funcionarioRepository.save(funcionarioModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(funcionarioModel);
    }
}