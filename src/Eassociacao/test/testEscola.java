package Eassociacao.test;

import Eassociacao.dominio.Escola;
import Eassociacao.dominio.Professor;

public class testEscola {
    public static void main(String[] args) {
        Professor professor1 = new Professor("joao");
        Professor professor2 = new Professor("figueredo");
        Professor[] professores = {professor1,professor2};
        Escola escola= new Escola("trivoso",professores);
        escola.imprime();
    }
}
