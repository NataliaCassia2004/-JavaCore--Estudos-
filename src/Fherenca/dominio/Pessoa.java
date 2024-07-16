package Fherenca.dominio;

public class Pessoa {
    protected String nome;
    protected int idade;
    protected String cpf;

    public Pessoa(String nome){
        this.nome = nome;
    }
    public void imprime(){
        System.out.println("DADOS:");
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.cpf);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
