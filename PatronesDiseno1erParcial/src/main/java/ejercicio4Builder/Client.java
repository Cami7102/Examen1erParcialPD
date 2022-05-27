package ejercicio4Builder;

public class Client {

    public static void main(String[] args){
        Owner carla = new Owner();

        BuilderCombos mega = new MegaPaquete();
        BuilderCombos mediano = new PaqueteMediano();
        BuilderCombos normal = new PaqueteNormal();

        System.out.println("*********************MEGA PAQUETE**********************");
        carla.setBuilder(mega);
        carla.prepararCombo();
        Combos combo1 = carla.getComboListo();
        combo1.showInfo();

        System.out.println("*********************PAQUETE MEDIANO**********************");
        carla.setBuilder(mediano);
        carla.prepararCombo();
        Combos combo2 = carla.getComboListo();
        combo2.showInfo();

        System.out.println("*********************PAQUETE NORMAL**********************");
        carla.setBuilder(normal);
        carla.prepararCombo();
        Combos combo3 = carla.getComboListo();
        combo3.showInfo();
    }
}
