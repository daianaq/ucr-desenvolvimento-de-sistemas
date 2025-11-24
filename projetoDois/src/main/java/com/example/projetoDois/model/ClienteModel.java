package com.example.projetoDois.model;

import jakarta.persistence.*;

@Entity
public class ClienteModel {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String dataDeNascimento;

    @Column(nullable = false)
    private String protocoloAtendimento;

    public ClienteModel() {
    }

    public ClienteModel(String nome, Long id, String dataDeNascimento, String protocoloAtendimento) {
        this.nome = nome;
        this.id = id;
        this.dataDeNascimento = dataDeNascimento;
        this.protocoloAtendimento = protocoloAtendimento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getProtocoloAtendimento() {
        return protocoloAtendimento;
    }

    public void setProtocoloAtendimento(String protocoloAtendimento) {
        this.protocoloAtendimento = protocoloAtendimento;
    }
}