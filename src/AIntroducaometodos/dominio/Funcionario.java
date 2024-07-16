package AIntroducaometodos.dominio;

import javax.swing.*;
import java.util.Arrays;

public class Funcionario {
    private String nome;
    private int idade;
    private double [] salario;
    private double media;

    public void imprimeDados(){
        JOptionPane.showMessageDialog(null,this.nome,"DADOS DO FUNCIONARIO",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,this.idade);
        JOptionPane.showMessageDialog(null,"salarios:"+ Arrays.toString(getSalario()));
    }

    public double mediaSalario() {
        double media = 0;
        for (double i : salario) {
            media += i;
        }
        JOptionPane.showMessageDialog(null,"média salarial: "+this.media);
        return 0;
    }

    public void setSalario(double[] salario) {
        this.salario = salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getSalario() {
        return salario;
    }

    public double getMedia() {
        return media;
    }
}

