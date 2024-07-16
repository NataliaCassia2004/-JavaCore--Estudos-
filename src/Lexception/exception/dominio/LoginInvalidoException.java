package Lexception.exception.dominio;

public class LoginInvalidoException extends Exception {
    public LoginInvalidoException() {
        super("login inválido");
    }

    public LoginInvalidoException(String message) {
        super(message);
    }
}
