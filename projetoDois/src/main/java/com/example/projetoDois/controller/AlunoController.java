package com.example.projetoDois.controller;

import com.example.projetoDois.model.AlunoModel;
import com.example.projetoDois.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoRepository alunoRepository;

    @GetMapping
    public List<AlunoModel> listarTodos(){
        return alunoRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<AlunoModel> salvar(@RequestBody AlunoModel alunoModel){
        alunoRepository.save(alunoModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(alunoModel);
    }
}