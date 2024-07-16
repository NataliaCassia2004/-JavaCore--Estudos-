package Nstrings.test;

public class StringPerformanceTest01 {
    public static void main(String[] args) {

        long inicio = System.currentTimeMillis();
        concatString(100_000);
        long fim = System.currentTimeMillis();
        System.out.println(fim-inicio + "ms");

         inicio = System.currentTimeMillis();
        concatStringBuider(300_000);
         fim = System.currentTimeMillis();
        System.out.println(fim-inicio + "ms");

    }


    public static void concatString(int tamanho) {
        String texto = "";
        for (int i = 0; i < tamanho; i++) {
            texto += i;
        }
    }


    public static void concatStringBuider(int tamanho){
            StringBuilder sb= new StringBuilder(tamanho);
        for (int i = 0; i < tamanho ; i++) {
            sb.append(i);

        }
    }

}
