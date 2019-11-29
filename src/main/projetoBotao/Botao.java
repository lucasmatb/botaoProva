package main.projetoBotao;

public abstract class Botao {
    private Acionavel acionavel;

    public Botao(Acionavel acionavel) {
        this.acionavel = acionavel;
    }

    public Acionavel getAcionavel() {
        return acionavel;
    }

    public void setAcionavel(Acionavel acionavel) {
        this.acionavel = acionavel;
    }
}
