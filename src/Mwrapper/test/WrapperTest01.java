package Mwrapper.test;

public class WrapperTest01 {
    //encapsulamento de tipos primitivos
    public static void main(String[] args) {
       byte bytep = 1;
       short shortp = 1;
       int intp = 1;
       long longp = 10L;
       float floatp = 10F;
       double doublep = 10D;
       char charP = 'W';
       boolean booleanp = false;



        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1; //autoboxing
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 10D;
        Character charW = 'W';
        Boolean booleanW = false;

        int i = intW; //unboxing
        Integer intW2 = Integer.parseInt("1");
        boolean verdadeiro = Boolean.parseBoolean("true");
        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isDigit('A'));
        System.out.println(Integer.max(1,3));
    }
}
