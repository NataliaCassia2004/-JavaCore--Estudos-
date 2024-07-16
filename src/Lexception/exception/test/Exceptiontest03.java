package Lexception.exception.test;

import java.io.File;
import java.io.IOException;

public class Exceptiontest03 {
    public static void main(String[] args) throws IOException {
        criarNovoarquivo();
    }



    private static void criarNovoarquivo() throws IOException{
        File file = new File("arquivo\\teste2.txt");
        try{
            boolean criado = file.createNewFile();
            System.out.println("Arquivo criado: "+ criado);
        }catch(IOException e){
            e.printStackTrace();
            throw e;
        }

    }
}