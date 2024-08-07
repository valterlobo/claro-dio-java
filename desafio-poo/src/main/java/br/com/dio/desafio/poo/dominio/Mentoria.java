package br.com.dio.desafio.poo.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

    private LocalDate dataInicio;

    public Mentoria() {
    }

    @Override
    public double calcularXP() {
        return XP_PADRAO + 20d;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    @Override
    public String toString() {
        return super.toString() + " | Mentoria{" +
                "dataInicio=" + dataInicio +
                '}';
    }
}
