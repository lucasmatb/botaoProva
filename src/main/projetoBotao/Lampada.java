package main.projetoBotao;

public class Lampada implements Acionavel {

    private Estado estado;

    public Lampada() {
        this.estado = Estado.DESLIGADO;
    }


    public Estado acionar() {
        if (estado == Estado.LIGADO) {
            estado = Estado.DESLIGADO;
        } else {
            estado = Estado.LIGADO;
        }
        return estado;
    }

    @Override
    public Estado getEstado() {
        return estado;
    }
}