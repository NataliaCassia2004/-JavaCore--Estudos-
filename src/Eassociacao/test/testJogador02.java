package Eassociacao.test;
import Eassociacao.dominio.Time;
import Eassociacao.dominio.Jogador;
public class testJogador02 {
    public static void main(String[] args) {
       Time time = new Time("Corinthians");
       Jogador jogador = new Jogador("Rivaldo");
       jogador.setTime(time);
       jogador.imprime();
    }
}
