package com.bancodigital.model;

import com.bancodigital.repository.ContaInterface;

import lombok.Getter;

@Getter
public abstract class ContaAbstract implements ContaInterface {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected Integer agencia;
    protected Integer numero;
    protected Double saldo = 0.0;
    protected Cliente cliente;

    public ContaAbstract(Cliente cliente) {
        this.agencia = ContaAbstract.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(Double valor) {
        saldo -= valor;

    }

    @Override
    public void depositar(Double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(Double valor, ContaInterface contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void imprimirInformacoesConta() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

}
