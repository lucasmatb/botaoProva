package main;

import java.util.ArrayList;
import java.util.List;

public class Album {
    private String nome;
    private Pessoa pessoa;
    private List<Figurinha> figurinhas;

    public Album(String nome, Pessoa pessoa) {
        this.nome = nome;
        this.pessoa = pessoa;
        figurinhas = new ArrayList<>();
    }

    public void colarFigurinha(Figurinha figurinha) {
        this.figurinhas.add(figurinha);
    }

    public void removerFigurinha(Figurinha figurinha) {
        this.figurinhas.remove(figurinha);
    }

    public int quantidadeFigurinhas() {
        return this.figurinhas.size();
    }
}
