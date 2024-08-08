package br.com.dio.lab.banco.dominio;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.Objects;

public class Transacao {

    public static final String SAQUE = "SACAR";
    public static final String DEPOSITO = "DEPOSITO";
    public static final String TRANSFERENCIA = "TRANSFERENCIA";
    public static final String RENDIMENTO = "RENDIMENTO";


    private final int fromNumero;
    private final int toNumero;
    private final double valor;
    private final String tipo;
    private final Timestamp timestamp;

    public Transacao(int fromNumero, int toNumero, double valor, String tipo, Timestamp timestamp) {
        this.fromNumero = fromNumero;
        this.toNumero = toNumero;
        this.valor = valor;
        this.timestamp = timestamp;
        this.tipo = tipo;
    }

    public static Timestamp getTimestamp() {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        return timestamp;
    }


    public static int diaMes() {
        return LocalDate.now().getDayOfMonth();
    }

    public static String mesAno() {
        return LocalDate.now().getYear() + "-" + LocalDate.now().getMonthValue();
    }

    @Override
    public String toString() {
        return "Transacao{" +
                "tipo=" + tipo +
                " , fromNumero=" + fromNumero +
                ", toNumero=" + toNumero +
                ", valor=" + valor +
                ", timestamp=" + timestamp +
                '}';
    }


    @Override
    public int hashCode() {
        return Objects.hash(fromNumero, toNumero, valor, tipo, timestamp);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transacao transacao = (Transacao) o;
        return fromNumero == transacao.fromNumero && toNumero == transacao.toNumero && Double.compare(valor, transacao.valor) == 0 && Objects.equals(tipo, transacao.tipo) && Objects.equals(timestamp, transacao.timestamp);
    }
}
