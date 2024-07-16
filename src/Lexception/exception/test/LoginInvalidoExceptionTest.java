package Lexception.exception.test;

import Lexception.exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            throw new RuntimeException(e);
        }
    }
    private static void logar() throws LoginInvalidoException {
        Scanner teclado = new Scanner(System.in);
        String userNameDB = "goku";
        String passwordDB = "supersaiajeans";
        System.out.println("Usuário: ");
        String userNameDigitado = teclado.nextLine();
        System.out.println("senha: ");
        String passwordDBDigitado = teclado.nextLine();

        if(!userNameDB.equals(userNameDigitado) || !passwordDB.equals(passwordDBDigitado)){
            throw new LoginInvalidoException("Usuario ou senha inválidos");
        }

        System.out.println("usuario logado com sucesso");


    }
}
