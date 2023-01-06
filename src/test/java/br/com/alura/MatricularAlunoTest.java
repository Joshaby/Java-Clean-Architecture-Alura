package br.com.alura;

import br.com.alura.escola.application.aluno.dto.MatricularAlunoDto;
import br.com.alura.escola.application.aluno.service.MatricularAluno;
import br.com.alura.escola.domain.aluno.Aluno;
import br.com.alura.escola.domain.aluno.CPF;
import br.com.alura.escola.infra.aluno.repository.impl.RepositorioDeAlunosEmMemoria;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MatricularAlunoTest {

    @Test
    public void alunoDeveriaSerPersistido() {
        RepositorioDeAlunosEmMemoria repositorio = new RepositorioDeAlunosEmMemoria();
        MatricularAluno userCase = new MatricularAluno(repositorio);

        String nome = "José Henrique";
        String cpf = "123.456.789-00";
        String email = "fulano123@email.com";

        MatricularAlunoDto dto = new MatricularAlunoDto(nome, cpf, email);

        userCase.matricular(dto);

        Aluno novo = repositorio.buscaPorCPF(new CPF(dto.getCpfAluno()));

        assertEquals(nome, novo.getNome());
        assertEquals(cpf, novo.getCpf().getNumero());
        assertEquals(email, novo.getEmail().getEndereco());
    }
}
