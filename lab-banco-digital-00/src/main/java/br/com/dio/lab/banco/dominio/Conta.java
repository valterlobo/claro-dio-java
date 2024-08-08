package br.com.dio.lab.banco.dominio;

import java.util.HashSet;
import java.util.Set;

public abstract class Conta implements IConta {

    protected static final int CONTA_ROOT = 1;
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 10;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;
    protected Set<Transacao> transacoes;


    public Conta(Cliente cliente, double saldo) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
        this.saldo = saldo;
        this.transacoes = new HashSet<>();
        transacoes.add(new Transacao(CONTA_ROOT, numero, saldo, Transacao.DEPOSITO, Transacao.getTimestamp()));
    }


    @Override
    public void depositar(double valor) {
        if (valor < 0) throw new IllegalStateException("VALOR NEGATIVO");
        saldo += valor;
        transacoes.add(new Transacao(CONTA_ROOT, numero, valor, Transacao.DEPOSITO, Transacao.getTimestamp()));
    }

    @Override
    public void sacar(double valor) {
        if (saldo < valor) throw new IllegalStateException("NAO TEM $$$$$$$ SALDO:" + saldo);
        saldo -= valor;
        transacoes.add(new Transacao(numero, CONTA_ROOT, valor, Transacao.SAQUE, Transacao.getTimestamp()));
    }

    @Override
    public void transferir(double valor, IConta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
        transacoes.add(new Transacao(numero, contaDestino.getNumero(), valor, Transacao.TRANSFERENCIA, Transacao.getTimestamp()));
    }

    @Override
    public Set<Transacao> getTransacoes() {
        return transacoes;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "agencia=" + agencia +
                ", numero=" + numero +
                ", saldo=" + saldo +
                ", cliente=" + cliente +
                '}';
    }
}
