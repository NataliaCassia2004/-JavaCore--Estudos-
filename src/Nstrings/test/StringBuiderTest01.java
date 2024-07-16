package Nstrings.test;

public class StringBuiderTest01 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        //muito parecido com String
        sb.append("nalatia");
        sb.append(" souza");
        //append é o concat do stringBuider
        //é mutável
        System.out.println(sb);
        System.out.println(sb.charAt(4));
        System.out.println(sb.substring(0,5));
    }

}
