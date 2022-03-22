package com.loja.cliente.document;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "cliente")
public class ClienteDocument {

    private String nome;

    private String cpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
