package org.claro.dio.poo.valter;

public class IPhone implements  AparelhoTelefonico, NavegadorInternet, ReprodutorMusical  {

    /**
     * @param numero
     */
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando:" + numero);
    }

    /**
     *
     */
    @Override
    public void atender() {
        System.out.println("Atendendo");

    }

    /**
     *
     */
    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");

    }

    /**
     * @param url
     */
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);

    }

    /**
     *
     */
    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba.");
    }

    /**
     *
     */
    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página.");

    }

    /**
     *
     */
    @Override
    public void tocar() {
        System.out.println("Tocando música.");
    }

    /**
     *
     */
    @Override
    public void pausar() {
        System.out.println("Pausando música.");

    }

    /**
     * @param musica
     */
    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música:" + musica);

    }
}
