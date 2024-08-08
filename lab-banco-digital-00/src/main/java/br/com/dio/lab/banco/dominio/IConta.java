package br.com.dio.lab.banco.dominio;

import java.util.Set;

public interface IConta {

    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, IConta contaDestino);

    Set<Transacao> getTransacoes();

    int getNumero();
}
