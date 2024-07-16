package Lexception.exception.test;

import Lexception.exception.dominio.Funcionario;
import Lexception.exception.dominio.LoginInvalidoException;

public class SobrescritacomExceptionTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        try{
            funcionario.salvar();
        }catch (LoginInvalidoException e){
            e.printStackTrace();
        }

    }
}
