package ejercicio3AbstractFactory;

public class Client {
    public static void main(String []args){
        Artefactos artefactos = FactoryArtefactos.make("Microondas");
        artefactos.showInfo();

    }
}
