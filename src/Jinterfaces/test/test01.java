package Jinterfaces.test;

import Jinterfaces.dominio.DataLoader;
import Jinterfaces.dominio.DatabaseLoader;
import Jinterfaces.dominio.FileLoader;

public class test01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();
        databaseLoader.load();
        fileLoader.load();
        databaseLoader.remove();
        fileLoader.remove();
        databaseLoader.checkPermission();
        fileLoader.checkPermission();
        DatabaseLoader.retrieveMaxDataSize();
        DataLoader.retrieveMaxDataSize();

    }
}
