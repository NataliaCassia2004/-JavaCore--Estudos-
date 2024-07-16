package Kpolimorfismo.servico;

import Kpolimorfismo.repositorio.Repositorio;

public class RepositorioBancodeDados implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando Banco de dados...");
    }
}
