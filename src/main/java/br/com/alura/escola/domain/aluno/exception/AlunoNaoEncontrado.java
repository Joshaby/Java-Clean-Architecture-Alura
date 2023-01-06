package br.com.alura.escola.domain.aluno.exception;

import br.com.alura.escola.domain.aluno.CPF;

public class AlunoNaoEncontrado extends RuntimeException {

    public AlunoNaoEncontrado(CPF cpf) {
        super(String.format("Aluno nao encontrado com CPF: " + cpf.getNumero()));
    }
}
