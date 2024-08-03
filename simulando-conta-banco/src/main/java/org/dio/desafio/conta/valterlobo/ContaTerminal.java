package org.dio.desafio.conta.valterlobo;

import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita e captura o número da conta
        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();

        // Limpa o buffer do scanner
        scanner.nextLine();

        // Solicita e captura a agência
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        // Solicita e captura o nome do cliente
        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        // Solicita e captura o saldo
        System.out.println("Por favor, digite o saldo:");
        double saldo = scanner.nextDouble();

        // Fecha o scanner
        scanner.close();

        //String numero, String agencia, String nomeCliente
        ContaBanco conta = new ContaBanco(numero,agencia,nomeCliente);
        conta.setSaldo(saldo);
        // Exibe a mensagem final com os dados capturados
        String mensagem = "Olá " + conta.getNomeCliente() + ", obrigado por criar uma conta em nosso banco, sua agência é " + conta.getAgencia() + ", conta " + conta.getNumero() + " e seu saldo " + conta.getSaldo() + " já está disponível para saque.";
        System.out.println(mensagem);
        //conta.deposito(10000.00);
        //System.out.println(conta.getSaldo());
    }
}
