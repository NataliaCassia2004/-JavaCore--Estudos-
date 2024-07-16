package Dmodificadorestatico.domain;

public class Carro {
    private String nome;
    private  double velocidadeMaxima;
    private static double velocidadeLimite =250;
    //modificador estatico faz com que os atributos pertencam a classe e todos os objetos vao ocmpatilhar do mesmo valor

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println("Limite: "+ Carro.velocidadeLimite);
        System.out.println("Velicidade maxima: "+this.velocidadeMaxima);
        System.out.println("----------------------");
    }

    public static void setVelocidadeLimite(double velocidadeLimite){
        Carro.velocidadeLimite = velocidadeLimite;
    }

    public static double getVelocidadeLimite(){
        return Carro.velocidadeLimite;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
}
