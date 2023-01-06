package br.com.alura.escola.aplication.aluno.service;

import br.com.alura.escola.aplication.aluno.dto.MatricularAlunoDto;
import br.com.alura.escola.domain.aluno.Aluno;
import br.com.alura.escola.domain.aluno.repository.RepositorioDeAlunos;

public class MatricularAluno {

    private final RepositorioDeAlunos repositorioDeAlunos;

    public MatricularAluno(RepositorioDeAlunos repositorioDeAlunos) {
        this.repositorioDeAlunos = repositorioDeAlunos;
    }

    public void matricular(MatricularAlunoDto dto) {
        Aluno novo = dto.criarAluno();
        repositorioDeAlunos.matricular(novo);
    }
}
