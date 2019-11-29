package main.projetoBotao;

public class Teste {
    public static void main(String[] args) {
        Acionavel acionavel = new Motor();
        Acionavel acionavel1 = new Lampada();


        BotaoTecla botaoTecla = new BotaoTecla(acionavel);
        BotaoTecla botaoTecla1 = new BotaoTecla(acionavel1);

        //Lampada lampada = new Lampada();


        botaoTecla.acionarBotao();
        botaoTecla.acionarBotao();
        botaoTecla.acionarBotao();
        botaoTecla.acionarBotao();
        botaoTecla.acionarBotao();
        botaoTecla.acionarBotao();
        botaoTecla.acionarBotao();
        botaoTecla.acionarBotao();

        botaoTecla1.acionarBotao();


        System.out.println("Estado do motor: " + acionavel.getEstado());
        System.out.println("Estado da lampada: " + acionavel1.getEstado());
    }
}
