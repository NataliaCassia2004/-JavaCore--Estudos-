package Henumeracao.dominio;

public enum TipoCliente {
    PESSOA_FISICA(1),
    PESSOA_JURIDICA(2);

    //construtor em enumeracao cria objetos!
    public final int valor; //estou associando um valor ao tipo cliente para facilitar a visualizacao
    TipoCliente(int valor) {
        this.valor=valor;
    }
}
