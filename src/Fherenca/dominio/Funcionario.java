package Fherenca.dominio;

public class Funcionario extends Pessoa{
    private double salario;
    public Funcionario(String nome, double salario){
        super(nome);
        this.salario = salario;
    }
    public void imprime(){
        super.imprime();
        System.out.println(this.salario);
    }

    public void relatorioPagamento(){
        System.out.println(this.nome+" recebeu "+this.salario+" reais.");
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
