package AIntroducaometodos.dominio;

public class Calculadora {
    int soma=0;
    public void somandocomVarArgs(int... num){
        for (int i: num){
            soma+=i;
      }
    }
    public int devolverSomaVarArgs(){
        return soma;
    }
}
