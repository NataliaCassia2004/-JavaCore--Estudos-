package Dmodificadorestatico.test;
import Dmodificadorestatico.domain.Carro;
public class Test01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro("bmw", 280);
        Carro carro2 = new Carro("celta", 275);
        //modificadro estatico faz com que eu possa modificar todas as instancias ao mesmo tempo
        //ele nao precisa das variaveis de referencia

        Carro.setVelocidadeLimite(150);

        carro1.imprime();
        carro2.imprime();
    }

}
