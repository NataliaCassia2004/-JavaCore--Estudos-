package Kpolimorfismo.servico;

import Kpolimorfismo.dominio.Computador;
import Kpolimorfismo.dominio.Produto;
import Kpolimorfismo.dominio.Tomate;

public class CalculadoraImposto {
    public static void calcularImposto(Produto produto){
        System.out.println("---------------------");
        System.out.println("_Relatório de imposto_");
        double imposto = produto.calcularimposto();
        System.out.println("Nome: "+produto.getNome());
        System.out.println("Preço: "+produto.getValor());
        System.out.println("Total com imposto: "+imposto);
        if(produto instanceof Tomate) {
            Tomate tomate = (Tomate) produto;
            System.out.println("Data de validade: "+((Tomate) produto).getDataDeValidade());
            System.out.println("imposto a ser pago (%): "+ Tomate.IMPOSTO_POR_CENTO);
        }
        if(produto instanceof Computador) {
            Computador computador = (Computador) produto;
            System.out.println("imposto a ser pago (%): "+ Computador.IMPOSTO_POR_CENTO);
        }

    }



}
