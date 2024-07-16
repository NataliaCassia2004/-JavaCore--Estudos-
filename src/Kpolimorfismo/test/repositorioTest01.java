package Kpolimorfismo.test;

import Kpolimorfismo.repositorio.Repositorio;
import Kpolimorfismo.servico.RepositorioArquivo;
import Kpolimorfismo.servico.RepositorioMemoria;

public class repositorioTest01 {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioArquivo();
        repositorio.salvar();
    }
}
