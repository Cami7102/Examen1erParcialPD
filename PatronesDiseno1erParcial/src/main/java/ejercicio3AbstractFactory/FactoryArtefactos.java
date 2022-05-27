package ejercicio3AbstractFactory;

import Ejercicio2Prototype.Televisor;

public class FactoryArtefactos {
    public static Artefactos make(String type){
        Artefactos artefactos;
        switch (type){
            case"Televisor":
                artefactos = (Artefactos) new Televisor();
                break;
            case"Radio":
                artefactos = new Radio();
                break;
            case"Batidora":
                artefactos = new Batidora();
                break;
            case"Refrigerador":
                artefactos = new Refrigerador();
                break;
            default:
                artefactos = new Microondas();
                break;
        }
        return artefactos;
    }
}
