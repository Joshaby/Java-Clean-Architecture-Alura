package br.com.alura.escola.domain.aluno;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CPF {

    private String numero;

    public CPF(String numero) {
        if (numero == null || !numero.matches("\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}")) {
            throw new IllegalArgumentException("CPF inválido!");
        }
        this.numero = numero;
    }
}
