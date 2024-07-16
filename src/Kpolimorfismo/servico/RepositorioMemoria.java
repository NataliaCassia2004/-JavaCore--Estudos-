package Kpolimorfismo.servico;

import Kpolimorfismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando memória...");
    }
}
