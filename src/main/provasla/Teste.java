package main.provasla;

public class Teste {
    public static void main(String[] args) {
        Botao botao = new Botao();
        Motor motor = new Motor(true);
        Lampada lampada = new Lampada(false);
        botao.acionarBotao();

        System.out.println("Estado do motor: " + motor.acionar());
        System.out.println("Estado da lampada: " + lampada.acionar());
    }
}
