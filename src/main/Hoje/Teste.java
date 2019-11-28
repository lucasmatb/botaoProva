package main.Hoje;

public class Teste {
    public static void main(String[] args) {
        Coisa coisaZe = new Coisa("Coisa do ze");
        Coisa coisaAna = new Coisa("Coisa da ana");

        Pessoa ze = new Pessoa("ze");
        ze.adicionar(coisaZe);

        Pessoa ana = new Pessoa("Ana");
        ana.adicionar(coisaAna);

        System.out.println(("Coisa do ze"));
        for(Coisa coisa: ze.getCoisas()){
            System.out.println(coisa.getNome());
        }

        System.out.println(("Coisa da Ana"));
        for(Coisa coisa: ana.getCoisas()){
            System.out.println(coisa.getNome());
        }

        ze.trocar(ana,coisaZe, coisaAna  );


        System.out.println(("Solicitacoes de Troca da Ana"));

        for(Troca troca: ana.getTrocas()){
            System.out.println("Solicitante: " + troca.getSolicitante().getNome());
            System.out.println("Coisa Oferecida: " + troca.getOferecida().getNome());
            System.out.println("Coisa Solicitada: " + troca.getSolicitada().getNome());
        }

        ana.responderSolicitacoesDeTroca();
    }
}
