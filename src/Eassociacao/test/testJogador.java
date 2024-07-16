package Eassociacao.test;
import Eassociacao.dominio.Jogador;


public class testJogador {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Romario");
        Jogador jogador2= new Jogador("Jose");
        Jogador jogador3 = new Jogador("Sebastiao");
        Jogador[] jogadores= {jogador1,jogador2,jogador3};



        //array

        for(Jogador jogador: jogadores){
            jogador.imprime();



    }


    }

}
