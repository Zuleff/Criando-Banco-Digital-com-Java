package com.bancodigital.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContaCorrente extends ContaAbstract {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    private String teste;

    @Override
    public void imprimirExtrato() {
        System.out.println("--- Extrato Conta Corrente ---");
        super.imprimirInformacoesConta();
    }

}
