package AIntroducaometodos.teste;
import AIntroducaometodos.dominio.Funcionario;

import javax.swing.*;

public class MainFuncionario {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome(JOptionPane.showInputDialog("qual seu nome?"));
        funcionario.setIdade(Integer.parseInt(JOptionPane.showInputDialog("idade:")));
        System.out.println(funcionario.getNome());
        double[] aux = new double[3];
        for(int i=0;i<3;i++){
           double sal = Double.parseDouble(JOptionPane.showInputDialog("Digite seu "+(i+1)+"° Salario:"));
           aux[i]=sal;
        }
        funcionario.setSalario(aux);
        funcionario.imprimeDados();
        funcionario.mediaSalario();
    }
}
