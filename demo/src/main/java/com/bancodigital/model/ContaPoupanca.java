package com.bancodigital.model;

public class ContaPoupanca extends ContaAbstract {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("--- Extrato Conta Poupanca ---");
        super.imprimirInformacoesConta();
    }
}
