package br.com.alura.escola.application.indicacao.service;

import br.com.alura.escola.domain.aluno.Aluno;

public interface EnviarEmailIndicacao {

    void enviarPara(Aluno indicado);
}
