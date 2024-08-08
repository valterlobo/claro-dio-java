package br.com.dio.lab.banco.dominio;

import java.util.LinkedHashSet;
import java.util.Set;

public class Banco {

    private final Set<Conta> contas;
    private String nome;

    public Banco() {
        contas = new LinkedHashSet<Conta>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conta> getContas() {
        return contas;
    }

    public void abrirConta(Conta conta) {
        this.contas.add(conta);
    }

}
