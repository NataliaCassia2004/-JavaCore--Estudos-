package Lexception.runtime.test;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {
        abreConexao();
    }

    public static String abreConexao(){
        try{
            System.out.println("abrindo arquivo");
            return "conexao aberta";

        }catch(Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("fechando recurso liberado pelo sistema operacional");
        }
        return null;
    }
}
