package br.com.alura.escola.domain.aluno;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Email {

    private String endereco;

    public Email(String endereco) {
        if (endereco == null || !endereco.matches("^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$")) {
            throw new IllegalArgumentException("Email inválido!");
        }
        this.endereco = endereco;
    }
}
