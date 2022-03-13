package com.dio.test;

import com.dio.Pessoa;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class AssertionsTest {

    @Test
    void deveValidarLancamentos() {
        int [] primeiroLancamento = {10, 20, 30, 40, 50};
        int [] segundoLancamento = {10, 20, 30, 40, 50};

        assertArrayEquals(primeiroLancamento, segundoLancamento);
    }

    @Test
    void deveValidarSeObjetoEstaNulo() {
        Pessoa pessoa1 = null;
        assertNull(pessoa1);

        Pessoa pessoa2 = new Pessoa("Fulano", LocalDate.now());
        assertNotNull(pessoa2);
    }

    @Test
    void deveValidarNumerosDeTiposDiferentes() {
        double valor = 5.0D;
        double outroValor = 5.0D;

        assertEquals(valor, outroValor);

    }

}
