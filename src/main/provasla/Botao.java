package main.provasla;

public class Botao {
    private Boolean estado;
    private Acionar acionar;

    public Botao() {
        this.estado = false;
    }
    public String acionarBotao() {
        if (estado == false) {
            estado = true;
        }
        estado = false;
        return acionar.acionar();

    }
}
