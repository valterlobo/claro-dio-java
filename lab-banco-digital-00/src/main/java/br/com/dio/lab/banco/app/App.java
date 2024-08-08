package br.com.dio.lab.banco.app;

import br.com.dio.lab.banco.dominio.*;

public class App {


    public static void main(String[] args) {

        Cliente joao = new Cliente("JOAO SILVA", "67676556490", "joao.silva@mail.com", "02188978924");
        Cliente maria = new Cliente("MARIA SILVA", "88676556650", "maria.silva@mail.com", "02188978888");
        System.out.println(joao);
        System.out.println(maria);

        Conta joaaCC = new ContaCorrente(joao, 1200.89);
        Conta mariaCP = new ContaPoupanca(maria, 200.00, 8);

        Banco banco = new Banco();
        banco.abrirConta(joaaCC);
        banco.abrirConta(mariaCP);

        System.out.println("JOAOOOOOOOO");
        System.out.println(joaaCC);
        joaaCC.depositar(2200.45);
        joaaCC.transferir(100, mariaCP);
        joaaCC.sacar(100.45);
        joaaCC.getTransacoes().forEach(System.out::println);
        System.out.println("SALDO FINAL:" + joaaCC.getSaldo());
        try {
            joaaCC.sacar(joaaCC.getSaldo() + 1000.00);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("---------");

        System.out.println("MARIAAAAAAAA");
        System.out.println(mariaCP);
        mariaCP.depositar(4000.00);

        ContaPoupanca cp = (ContaPoupanca) mariaCP;
        cp.calcularRendimento();
        try {
            mariaCP.sacar(joaaCC.getSaldo() + 1000.00);
        } catch (Exception e) {
            System.out.println(e);
        }
        mariaCP.getTransacoes().forEach(System.out::println);
        System.out.println("SALDO FINAL:" + mariaCP.getSaldo());
        System.out.println("---------");
    }

}
