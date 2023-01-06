package br.com.alura.escola.domain.aluno;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Telefone {

    private String ddd;
    private String numero;

    public Telefone(String ddd, String numero) {
        if (ddd == null || numero == null) {
            throw new IllegalArgumentException("DDD e Número são obrigatórios!");
        }
        if (!ddd.matches("\\d{2}")) {
            throw new IllegalArgumentException("DDD inválido!");
        }
        if (!numero.matches("\\d{8}|\\d{9}")) {
            throw new IllegalArgumentException("Número inválido");
        }
        this.ddd = ddd;
        this.numero = numero;
    }
}
