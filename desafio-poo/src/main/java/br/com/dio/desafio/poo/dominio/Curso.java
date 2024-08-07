package br.com.dio.desafio.poo.dominio;

public class Curso extends Conteudo {


    private int cargaHoraria;

    public Curso() {
    }

    @Override
    public double calcularXP() {
        return XP_PADRAO * cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }


    @Override
    public String toString() {

        return super.toString() + " | Curso{" +
                "cargaHoraria=" + cargaHoraria +
                '}';
    }
}
