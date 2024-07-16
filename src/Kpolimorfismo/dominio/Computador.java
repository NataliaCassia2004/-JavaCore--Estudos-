package Kpolimorfismo.dominio;

public class Computador extends Produto{
    public static final double IMPOSTO_POR_CENTO = 0.21;

    public Computador(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularimposto() {
        System.out.println("calculando imposto do computador...");
        return this.valor+this.valor*IMPOSTO_POR_CENTO;
    }


}
