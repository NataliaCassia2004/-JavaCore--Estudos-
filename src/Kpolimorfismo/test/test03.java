package Kpolimorfismo.test;

import Kpolimorfismo.dominio.Computador;
import Kpolimorfismo.dominio.Produto;
import Kpolimorfismo.dominio.Tomate;
import Kpolimorfismo.servico.CalculadoraImposto;

public class test03 {
    public static void main(String[] args) {
        Produto produto1 = new Computador("Samsung", 10000);
        Produto produto2 = new Tomate("Cereja", 0.3,"10/03/2024");
        CalculadoraImposto.calcularImposto(produto1);
        CalculadoraImposto.calcularImposto(produto2);

    }
}
