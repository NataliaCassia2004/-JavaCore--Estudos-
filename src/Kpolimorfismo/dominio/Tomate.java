package Kpolimorfismo.dominio;

public class Tomate extends Produto{
    public static final double IMPOSTO_POR_CENTO = 0.06;
    public String dataDeValidade;
    public Tomate(String nome, double valor, String dataDeValidade) {
        super(nome, valor);
        this.dataDeValidade = dataDeValidade;
    }



    @Override
    public double calcularimposto() {
        System.out.println("calculando imposto do tomate...");
        return this.valor+this.valor*IMPOSTO_POR_CENTO;
    }




    public String getDataDeValidade() {
        return dataDeValidade;
    }

    public void setDataDeValidade(String dataDeValidade) {
        this.dataDeValidade = dataDeValidade;
    }
}
