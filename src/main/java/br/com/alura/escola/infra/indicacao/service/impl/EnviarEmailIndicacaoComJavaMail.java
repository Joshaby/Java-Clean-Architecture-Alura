package br.com.alura.escola.infra.indicacao.service.impl;

import br.com.alura.escola.application.indicacao.service.EnviarEmailIndicacao;
import br.com.alura.escola.domain.aluno.Aluno;

public class EnviarEmailIndicacaoComJavaMail implements EnviarEmailIndicacao {

    @Override
    public void enviarPara(Aluno indicado) {
        // lógica de envio
    }
}
