package br.com.alura;

import static org.junit.Assert.assertThrows;

import br.com.alura.escola.domain.aluno.Telefone;
import org.junit.Test;

public class TelefoneTest {

    @Test
    public void naoDeveriaCriarTelefoneComDDDsInvalidos() {
        assertThrows(IllegalArgumentException.class, () -> new Telefone(null, "123456789"));
        assertThrows(IllegalArgumentException.class, () -> new Telefone("", "123456789"));
        assertThrows(IllegalArgumentException.class, () -> new Telefone("1", "123456789"));
    }
}
