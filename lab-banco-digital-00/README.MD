# Criando um Banco Digital com Java e Orientação a Objetos 


## Análise do Problema e Modelagem Orientada a Objetos

**Identificação das Classes:**

* **Conta:** Classe base para todos os tipos de contas, com atributos comuns como número da conta, saldo e cliente.
* **ContaCorrente:** Subclasse de Conta, com funcionalidades específicas como cheque especial.
* **ContaPoupança:** Subclasse de Conta, com funcionalidades específicas como rendimento mensal.
* **Cliente:** Classe para representar os clientes do banco, com atributos como nome, CPF e endereço.
* **Banco:** Classe para representar o banco, com funcionalidades como criar contas, realizar transferências e consultar saldos.

**Diagramas de Classes (UML):**

![](diagram.png)

**Atributos e Métodos:**


* **Conta:**
    * Número da conta (int)
    * Agencia (int)
    * Saldo (double)
    * Cliente (objeto da classe Cliente)
    * Métodos: depositar(), sacar(), transferir()
* **ContaCorrente:**
    * -> Conta
* **ContaPoupança:**
    * ->   
    * Dia de aniversário (Date)
    * Taxa de rendimento (double)
    * Métodos: calcularRendimento()
* **Cliente:**
    * Nome (String)
    * CPF (String)
    * Telefone(String)
    * Email(String)
* **Banco:**
    * Lista de contas (Set<Conta>)
    * Métodos: abrirConta(), buscarConta() 





### Exemplo de Uso

```java
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
```

### Considerações Adicionais

* **Encapsulamento:** Utilizar modificadores de acesso (public, private, protected) para controlar a visibilidade dos atributos e métodos.
* **Herança:** A hierarquia de classes permite a reutilização de código e a criação de classes mais específicas.
* **Polimorfismo:** Permite tratar objetos de diferentes classes como se fossem de uma classe pai comum.
* **Exceções:** Utilizar try-catch para tratar erros, como saldo insuficiente ou conta não encontrada.
* **Interfaces:** Definir contratos que as classes devem implementar, como a interface `Transferivel` para permitir transferências entre diferentes tipos de contas.


