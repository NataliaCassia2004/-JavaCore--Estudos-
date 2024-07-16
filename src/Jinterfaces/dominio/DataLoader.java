package Jinterfaces.dominio;

public interface DataLoader {
    //todos os atributos da interface sao static final!
    int MAX_DATA_SIZE = 10;

    void load();
    default void checkPermission(){
        System.out.println("fazendo checagem de permissoes...");
    }

    static void retrieveMaxDataSize(){
        System.out.println("dentro do metodo retrieveMaxDataSize na interface...");
    }
}
