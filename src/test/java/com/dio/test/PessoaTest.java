package com.dio.test;

import com.dio.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;


public class PessoaTest {

    @Test
    void deveCalcularIdadeCorretamente() {
        Pessoa pessoa = new Pessoa("Fulano", LocalDate.of(2000, 01, 01));
        Assertions.assertEquals(22, pessoa.getIdade());
    }

    @Test
    void deveRetornaSeForMaiorDeIdade() {
        Pessoa pessoa1 = new Pessoa("Fulano", LocalDate.of(2000, 01, 01));
        Assertions.assertTrue(pessoa1.ehMaiorDeIdade());

        Pessoa pessoa2 = new Pessoa("Beltrano", LocalDate.now());
        Assertions.assertFalse(pessoa2.ehMaiorDeIdade());
    }

}
