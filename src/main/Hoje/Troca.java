package main.Hoje;

public class Troca {
    private Pessoa solicitante;
    private Pessoa destinatario;
    private Coisa solicitada;
    private Coisa oferecida;
    private boolean efetivada;


    public Troca(Pessoa solicitante, Pessoa destinatario, Coisa solicitada, Coisa oferecida) {
        this.solicitante = solicitante;
        this.destinatario = destinatario;
        this.solicitada = solicitada;
        this.oferecida = oferecida;
        this.efetivada = false;

    }

    public Pessoa getSolicitante() {
        return solicitante;
    }

    public Pessoa getDestinatario() {
        return destinatario;
    }

    public Coisa getSolicitada() {
        return solicitada;
    }

    public Coisa getOferecida() {
        return oferecida;
    }
}
