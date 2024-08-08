package br.com.dio.lab.banco.dominio;

import java.util.HashMap;
import java.util.Map;

public class ContaPoupanca extends Conta {

    private final int diaSaque;
    private final int taxaRendimento = 1;
    private final Map<String, Double> rendimentos = new HashMap<>();


    public ContaPoupanca(Cliente cliente, double saldo, int dia) {
        super(cliente, saldo);
        this.diaSaque = dia;
    }


    /***
     * Saque so pode ser realizado no dia do aniversario do mes
     * @param valor
     */
    @Override
    public void sacar(double valor) {
        if (diaSaque != Transacao.diaMes()) throw new IllegalStateException("NÂO É O DIA PARA O SAQUE :" + diaSaque);
        super.sacar(valor);
    }


    public void calcularRendimento() {

        String mesAno = Transacao.mesAno();
        if (diaSaque == Transacao.diaMes() && !rendimentos.containsKey(mesAno)) {
            double rendimento = saldo * taxaRendimento / 100.00;
            rendimentos.put(mesAno, Double.valueOf(rendimento));
            saldo += rendimento;
            transacoes.add(new Transacao(CONTA_ROOT, numero, rendimento, Transacao.RENDIMENTO, Transacao.getTimestamp()));
        }
    }
}
