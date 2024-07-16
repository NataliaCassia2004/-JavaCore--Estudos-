package Fherenca.test;

import Fherenca.dominio.Funcionario;

public class test01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("tito",122.343);
        funcionario.imprime();
        funcionario.relatorioPagamento();
    }
}
