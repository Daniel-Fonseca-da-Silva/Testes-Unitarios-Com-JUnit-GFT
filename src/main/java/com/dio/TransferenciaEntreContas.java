package com.dio;

public class TransferenciaEntreContas {

    public void transfere(Conta contaOrigem, Conta ContaDestino, double valor) {
        if(valor <= 0) {
            throw new IllegalArgumentException("Valor deve ser maior que zero");
        }
    }

}
