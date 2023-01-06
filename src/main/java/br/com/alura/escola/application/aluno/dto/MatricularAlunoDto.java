package br.com.alura.escola.application.aluno.dto;

import br.com.alura.escola.domain.aluno.Aluno;
import br.com.alura.escola.domain.aluno.CPF;
import br.com.alura.escola.domain.aluno.Email;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class MatricularAlunoDto {

    private String nomeAluno;

    private String cpfAluno;

    private String emailAluno;

    public Aluno criarAluno() {
        return new Aluno(new CPF(cpfAluno), nomeAluno, new Email(emailAluno));
    }
}
