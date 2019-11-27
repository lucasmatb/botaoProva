package view;

import main.Album;
import main.Figurinha;
import main.Jogador;
import main.Pessoa;

public class Teste {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("ze");
        Pessoa pesso2 = new Pessoa("joao");

        Jogador jogador1 = new Jogador("sa");

        Album album1 = new Album("Album1",pessoa1);


        Figurinha fig1 = new Figurinha("1");
        Figurinha fig2 = new Figurinha("2");
        Figurinha fig3 = new Figurinha("3");

        album1.colarFigurinha(fig1);
        album1.colarFigurinha(fig2);
        jogador1.adicionarFigurinha(fig3);
        System.out.println(album1.quantidadeFigurinhas());

        jogador1.trocarFigurinha(pessoa1);



    }
}
