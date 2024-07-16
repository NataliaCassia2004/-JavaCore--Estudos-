package Lexception.runtime.test;

public class RuntimeExceptionTest01 {
    public static void main(String[] args) {
        // CHECKED E UNCHECKED
        // checked: filhas da classes exception diretamente; se não forem tratadas vao gerar um erro de compilacao
        // unchecked: filhas runtimeexception; tratamento nao obrigatorio; quando sao lançadas pelo programa, quer dizer que o problema esta no seu codigo
     Object object = null;
        System.out.println(object.toString());
        // vai ter uma runtimeexception, estou tentando acessar um metodo sem o objeto


      /*
        int[] array = {1,2};
        System.out.println(array[2]);
        AQUI EU TAMBEM ESTOU TENTANDO ACESSAR ALGO QUE NAO EXISTE.
       */
    }





}
