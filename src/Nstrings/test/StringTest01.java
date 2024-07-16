package Nstrings.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Willian"; //string é constante
        String nome2 = "Willian";
        nome.concat(" Souza"); //mesmo que eu concatene, não vai mudar nada, eles (nome e nome2) continuam fazendo a mesma referencia
        //só muda se eu mudar a referencia...
        nome = nome.concat(" Souza");
        System.out.println(nome==nome2); //tem a mesma referencia pois fazem referencia ao mesmo objeto
        System.out.println(nome);
        System.out.println(nome2);


        //metodos

        System.out.println(nome.charAt(1));
        System.out.println(nome.length());
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());
        System.out.println(nome.replace("a","u"));
        System.out.println(nome.substring(0,2));
        System.out.println(nome.trim());

    }
}
