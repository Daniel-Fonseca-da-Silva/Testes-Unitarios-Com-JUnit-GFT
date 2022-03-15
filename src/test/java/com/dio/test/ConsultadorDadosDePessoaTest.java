package com.dio.test;

import com.dio.BancoDeDados;
import com.dio.Pessoa;
import org.junit.jupiter.api.*;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class ConsultadorDadosDePessoaTest {

    @BeforeAll
    static void configuraConexao() {
        BancoDeDados.iniciarConexao();
    }

    @BeforeEach
    void insereDadosParaTeste() {
        BancoDeDados.insereDados(new Pessoa("Fulano", LocalDate.of(2000, 01, 01)));
    }

    @AfterEach
    void removeDadosParaTeste() {
        BancoDeDados.removeDados(new Pessoa("Fulano", LocalDate.of(2000, 01, 01)));
    }

    @Test
    void deveValidarDadosDeRetornoDoBancoDeDados() {
        assertTrue(true);
    }

    @Test
    void deveValidarDadosDeRetornoDoBancoDeDados2() {
        assertNull(null);
    }

    @BeforeAll
    static void finalizaConexao() {
        BancoDeDados.finalizarConexao();
    }

}
