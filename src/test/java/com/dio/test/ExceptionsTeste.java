package com.dio.test;

import com.dio.Conta;
import com.dio.TransferenciaEntreContas;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class ExceptionsTeste {

    @Test
    void deveValidarCenarioDeExcecaoNaTransferencia() {
        Conta contaOrigem = new Conta("125673", 0);
        Conta  contaDestino = new Conta("35327",1554.99);

        TransferenciaEntreContas TransferenciaEntreContas = new TransferenciaEntreContas();

//        Assertions.assertThrows(IllegalArgumentException.class, () ->
//            TransferenciaEntreContas.transfere(contaOrigem, contaDestino, -1));

        Assertions.assertDoesNotThrow(() -> TransferenciaEntreContas.transfere(contaOrigem, contaDestino, 20));

    }

}
