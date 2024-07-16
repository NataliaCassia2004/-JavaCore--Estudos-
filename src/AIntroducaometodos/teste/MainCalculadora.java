package AIntroducaometodos.teste;
import AIntroducaometodos.dominio.Calculadora;

import javax.swing.*;

public class MainCalculadora {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somandocomVarArgs(1,2,3,4);
        JOptionPane.showMessageDialog(null,Integer.toString(calculadora.devolverSomaVarArgs()));
    }


}
