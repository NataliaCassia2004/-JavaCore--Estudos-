package Bsobrecargametodos.test;
import Bsobrecargametodos.dominio.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime("web",11,"nome","acao",2001);
        //sobrecarga de metodos é quando eu dou o mesmo nome pra um metodo novo pq eu preciso colocar mais coisas nele!
        //anime.init("TV",11,"luiza","romance");
        anime.imprime();


    }
}
