package com.bancodigital.repository;

public interface ContaInterface {

    void depositar(Double valor);

    void sacar(Double valor);

    void transferir(Double valor, ContaInterface contaDestino);

    void imprimirExtrato();

}
