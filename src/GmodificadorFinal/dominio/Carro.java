package GmodificadorFinal.dominio;
//Modificador final na classe é para dizer que ela não pode ser extendida
public final class Carro {
    private String nome;
    public final double VELOCIDADE_FINAL = 250;

    public void imprime(){
        System.out.println(this.nome);
    }

    /* Modificador final no método é para dizer que ele não pode ser sobrescrito em outras classes,
    para não ter alteração e sobrecarregamento em nenhuma das classes filhas.

    public final void imprime(){
        System.out.println(this.nome);
    }
    */






    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
