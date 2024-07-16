package Henumeracao.test;

import Henumeracao.dominio.Cliente;
import Henumeracao.dominio.TipoCliente;
import Henumeracao.dominio.TipoPagamento;

public class test01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Carlos", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        System.out.println(cliente1);
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(20));


    }
}
