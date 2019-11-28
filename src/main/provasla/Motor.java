package main.provasla;

public class Motor implements Acionar {
    private Boolean estado;

    public Motor(Boolean estado) {
        this.estado = estado;
    }

    @Override
    public String acionar() {
        if (estado == false) {
            estado = true;
            return "Motor ligado";

        } else {
            estado = false;
            return "Motor desligado";
        }
    }
}
