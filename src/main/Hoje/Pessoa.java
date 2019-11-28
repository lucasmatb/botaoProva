package main.Hoje;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.LinkedBlockingDeque;

public class Pessoa {
    private String nome;
    private List<Coisa> coisas;
    private List<Troca> trocas;

    public Pessoa(String nome) {
        this.nome = nome;
        this.coisas = new ArrayList<>();
        this.trocas = new ArrayList<>();
    }

    public int quantidade() {
        return coisas.size();
    }

    public void adicionar(Coisa coisa) {
        this.coisas.add(coisa);
    }

    public void remover(Coisa coisa) {
        this.coisas.remove(coisa);
    }

    public List<Coisa> getCoisas() {
        return coisas;
    }

    public void trocar(Pessoa ana, Coisa coisaZe, Coisa coisaAna) {
// this.trocas.add(new Troca(solicitante, destinatario, coisaSolicitada, coisaOferecida));
        ana.trocas.add(new Troca(this, ana, coisaAna, coisaZe));
    }

    public List<Troca> getTrocas() {
        return trocas;
    }

    public String getNome() {
        return nome;
    }

    public void responderSolicitacoesDeTroca() {
        System.out.println("Responder solicitacao de troca");

        Scanner teclado = new Scanner(System.in);


        for(Troca troca: trocas) {
            System.out.println("Aceita trocar ");
            System.out.println(troca.getSolicitada().getNome());
            System.out.println("Pela ");
            System.out.println(troca.getOferecida().getNome());
            boolean resposta = teclado.nextBoolean();
            if(resposta) {
                efetivarTroca(troca);
            } else {
                System.out.println("nao sei oque fazer");
            }
        }

    }

    private void efetivarTroca(Troca troca) {



    }
}
