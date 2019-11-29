package main.projetoBotao;

public class BotaoTecla extends Botao implements TipoDoBotao{

    private Boolean estado;

    public BotaoTecla(Acionavel acionavel) {
        super(acionavel);
        this.estado = false;
    }

  /*public void pressionar() {
        this.acionavel.acionar();
    }*/

    @Override
    public String acionarBotao() {
        if (estado == false) {
            estado = true;
            acionamento();
        }
        estado = false;
        return "Click";
    }

    public String acionamento() {
        if(estado == true){
            this.getAcionavel().acionar();
            return "O botão foi acionado";
        }
        return "Acionado";
    }
}
