package main;

import java.util.ArrayList;
import java.util.List;

public class Jogador {
    private String nome;
    private Album album;
    private List<Figurinha> figurinhas;
    private Pessoa pessoa;

    public Jogador(String nome) {
        this.nome = nome;
        this.album = album;
        figurinhas = new ArrayList<>();
    }

    public void adicionarFigurinha(Figurinha figurinha) {
        this.figurinhas.add(figurinha);
    }

    public void removerFigurinha(Figurinha figurinha) {
        this.figurinhas.remove(figurinha);
    }

    public void trocarFigurinha (Pessoa pessoa) {

    }
}
