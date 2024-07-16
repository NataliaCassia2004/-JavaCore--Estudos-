package Lexception.exception.dominio;

import java.io.FileNotFoundException;

public class Funcionario extends Pessoa{

    public void salvar() throws LoginInvalidoException{
        System.out.println("salvando funcionario");
    }
}
