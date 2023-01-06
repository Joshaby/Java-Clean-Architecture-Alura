package br.com.alura.escola.domain.aluno;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Aluno {

    private CPF cpf;

    private String nome;

    private Email email;

    private String senha;

    private List<Telefone> telefones;

    public Aluno(CPF cpf, String nome, Email email) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
    }

    public void adicionarTelefone(String ddd, String numero) {
        this.telefones.add(new Telefone(ddd, numero));
    }
}