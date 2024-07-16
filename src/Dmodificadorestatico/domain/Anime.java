package Dmodificadorestatico.domain;

import java.util.Arrays;

public class Anime {
    private String nome;
    private static int[] episodios;

    //bloco de inicializaçao: ele inicia quando chama a classe, ai voce nao precisa usar o construtor, pq se
    //eu colocasse esse negocio debaixo la no construtor daria erro, pois um dos construtores ta pedindo uma string e outro nao
    //sempre inicia primeiro na instancia
       static{
        episodios = new int[100];
        for(int i=0; i<episodios.length;i++){
            episodios[i]=i;
        }
        System.out.println(Arrays.toString(episodios));
    }


    public Anime(String nome) {
        this.nome = nome;
    }

    public int[] getEpisodios() {
        return Anime.episodios;
    }


    public String getNome() {
        return nome;
    }


}