package com.dio.test;

import com.dio.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PessoaTest {

    @Test
    void validaCalculoDeIdade() {
        Pessoa pessoa = new Pessoa("Fulano", LocalDate.of(2020, 01, 01));
        Assertions.assertEquals(2, pessoa.getIdade());
    }

}
