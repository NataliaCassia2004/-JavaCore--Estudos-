package Kpolimorfismo.test;

import Kpolimorfismo.dominio.Computador;
import Kpolimorfismo.dominio.Tomate;
import Kpolimorfismo.servico.CalculadoraImposto;

public class test01 {
    public static void main(String[] args) {
        Computador computador = new Computador("Dell",5000);
        Tomate tomate = new Tomate("Japones",0.50,"10/10/2024");
        CalculadoraImposto.calcularImposto(computador);
        CalculadoraImposto.calcularImposto(tomate);

    }
}
