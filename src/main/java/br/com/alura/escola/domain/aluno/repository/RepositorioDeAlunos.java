package br.com.alura.escola.domain.aluno.repository;

import br.com.alura.escola.domain.aluno.Aluno;
import br.com.alura.escola.domain.aluno.CPF;

import java.util.List;

public interface RepositorioDeAlunos {

    void matricular(Aluno aluno);

    Aluno buscaPorCPF(CPF cpf);

    List<Aluno> listarTodosAlunosMatriculados();
}
