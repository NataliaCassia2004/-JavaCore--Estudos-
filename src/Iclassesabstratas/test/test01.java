package Iclassesabstratas.test;

import Iclassesabstratas.dominio.Desenvolvedor;
import Iclassesabstratas.dominio.Gerente;

public class test01 {
    public static void main(String[] args) {
       // Funcionario funcionario = new Funcionario("joao",2000); - depois que eu modifiquei a classe para abstrata, nao posso mais ter um objeto do tipo funcionario.

        Gerente gerente = new Gerente("jana",5000);
        System.out.println(gerente);
        Desenvolvedor desenvolvedor = new Desenvolvedor("juan",12000);
        System.out.println(desenvolvedor);
        gerente.imprime();
        desenvolvedor.imprime();
    }
}
