package Lexception.exception.test;

import Lexception.exception.dominio.Leitor1;
import Lexception.exception.dominio.Leitor2;

import java.io.IOException;

public class TrywhiteResources {
    public static void main(String[] args) {
   lerArquivo();
    }

    private static void lerArquivo(){
        try(Leitor1 leitor1 = new Leitor1();
            Leitor2 leitor2 = new Leitor2();){

    }catch(IOException e){
            e.printStackTrace();
        }
    }
}
