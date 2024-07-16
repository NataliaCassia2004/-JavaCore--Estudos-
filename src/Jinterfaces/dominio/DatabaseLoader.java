package Jinterfaces.dominio;

public class DatabaseLoader implements DataLoader,DataRemover{
    @Override
    public void load() {
        System.out.println("carregando dados do Banco de dados...");
    }

    @Override
    public void remove() {
        System.out.println("removendo dados do banco de dados...");
    }

    @Override
    public void checkPermission() {
        System.out.println("chegando permissoes no BD...");
    }

    public static void retrieveMaxDataSize(){
        System.out.println("dentro do metodo retrieveMaxDataSize na classe DatabaseLoader...");
    }
}
