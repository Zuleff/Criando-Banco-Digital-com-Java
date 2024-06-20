package com.bancodigital.service;

import com.bancodigital.model.Cliente;
import com.bancodigital.model.ContaAbstract;
import com.bancodigital.model.ContaCorrente;
import com.bancodigital.model.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNome("joao");

        ContaAbstract contaCorrente = new ContaCorrente(cliente);
        ContaAbstract contaPoupanca = new ContaPoupanca(cliente);

        contaCorrente.depositar(100.0);
        contaCorrente.transferir(70.0, contaPoupanca);

        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();

    }
}
