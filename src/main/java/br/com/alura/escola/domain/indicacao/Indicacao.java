package br.com.alura.escola.domain.indicacao;

import br.com.alura.escola.domain.aluno.Aluno;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class Indicacao {

    private Aluno indicado;

    private Aluno indicante;

    private LocalDateTime dataIndicacao;

    public Indicacao(Aluno indicado, Aluno indicante) {
        this.indicado = indicado;
        this.indicante = indicante;
        this.dataIndicacao = LocalDateTime.now();
    }
}
