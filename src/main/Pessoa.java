package main;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private String nome;
    private Album album;
    private List<Figurinha> figurinhas;
    private Jogador jgoador;

    public Pessoa(String nome) {
        this.nome = nome;
        this.album = album;
        figurinhas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarFigurinha(Figurinha figurinha) {
        this.figurinhas.add(figurinha);
    }

    public void removerFigurinha(Figurinha figurinha) {
        this.figurinhas.remove(figurinha);
    }

    public void trocarFigurinha(Jogador jogador) {

    }

}
