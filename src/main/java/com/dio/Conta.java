package com.dio;

import java.math.BigDecimal;

public class Conta {

    private String numeroConta;

    private double saldo;

    public Conta(String numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void lancaCredito(double valor) {
        this.saldo += valor;
    }

    public void lancaDebito(double valor) {
        this.saldo -= valor;
    }
}
