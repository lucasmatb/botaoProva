package main.provasla;

public class Lampada implements Acionar {
    private boolean estado;

    public Lampada(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String acionar() {
        if (estado == false) {
            estado = true;
            return "Lâmpada ligada";

        } else {
            estado = false;
            return "Lâmpada apagada";
        }
    }
}
