package com.alura.agenda.model;

public class AlunoBuilder {
    private String nome;
    private String telefone;
    private String email;

    public AlunoBuilder setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public AlunoBuilder setTelefone(String telefone) {
        this.telefone = telefone;
        return this;
    }

    public AlunoBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public Aluno createAluno() {
        return new Aluno(nome, telefone, email);
    }
}