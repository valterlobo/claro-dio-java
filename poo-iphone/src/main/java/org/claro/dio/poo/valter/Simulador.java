package org.claro.dio.poo.valter;

public class Simulador {

    public static void main(String[] args) {
        IPhone myPhone = new IPhone();

        //Telefone
        System.out.println("--------------------------TELEFONE--------------------------");
        myPhone.ligar("2199995555");
        myPhone.tocar();
        myPhone.iniciarCorreioVoz();

        //Navegador
        System.out.println("--------------------------NAVEGADOR--------------------------");
        myPhone.exibirPagina("http://www.dio.me");
        myPhone.adicionarNovaAba();
        myPhone.atualizarPagina();

        System.out.println("--------------------------REPRODUTOR--------------------------");
        myPhone.selecionarMusica("Imperial March (from “Star Wars”)");
        myPhone.tocar();
        myPhone.pausar();
    }
}
