package Lexception.exception.test;

import java.io.File;
import java.io.IOException;

public class Exceptiontest01 {
    public static void main(String[] args) {
       criarNovoarquivo();
    }



    private static void criarNovoarquivo(){
        File file = new File("arquivo\\teste.txt");
        try{
          boolean criado = file.createNewFile();
            System.out.println("Arquivo criado: "+ criado);
        }catch(IOException e){
            e.printStackTrace();
        }

    }
}
