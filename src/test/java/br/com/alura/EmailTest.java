package br.com.alura;

import static org.junit.Assert.assertThrows;

import br.com.alura.escola.domain.aluno.Email;
import org.junit.Test;

public class EmailTest {

    @Test
    public void naoDeveriaCriarEmailsComEnderecosInvalidos() {
        assertThrows(IllegalArgumentException.class, () -> new Email(null));
        assertThrows(IllegalArgumentException.class, () -> new Email(""));
        assertThrows(IllegalArgumentException.class, () -> new Email("null"));
    }
}
