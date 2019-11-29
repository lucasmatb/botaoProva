package main.projetoBotao;

public class Motor implements Acionavel {

    private Estado estado;

    public Motor() {
        this.estado = Estado.DESLIGADO;
    }


    public Estado acionar() {
        if (estado.equals(Estado.LIGADO)) {
            estado = Estado.DESLIGADO;
        } else {
            estado = Estado.LIGADO;
        }
        return estado;
    }

    public Estado getEstado() {
        return estado;
    }
}
