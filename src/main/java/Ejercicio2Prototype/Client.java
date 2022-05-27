package Ejercicio2Prototype;

public class Client {
    public static void main(String[] args){

        Televisor tem = new Televisor();
        tem.setSistemaOperativo("android");
        tem.setVersiónSistemaOperativo("11.0");
        tem.setPulgadas(80);
        tem.setResolucion(50);
        tem.setPuertoHDMI(true);
        tem.setPuertosUSB(4);
        tem.setControlRemoto(true);
        tem.setBluetooth(true);
        tem.setSerialTelevisor("10 dígitos");

        SerialTelevisor uno = new SerialTelevisor();
        uno.setSerial("10 digitos");

        SerialTelevisor dos = new SerialTelevisor();
        dos.setSerial("8 digitos");

        SerialTelevisor tres = new SerialTelevisor();
        tres.setSerial("6 digitos");

        SerialTelevisor cuatro = new SerialTelevisor();
        cuatro.setSerial("4 digitos");

        SerialTelevisor cinco = new SerialTelevisor();
        cinco.setSerial("2 digitos");

        Televisor  televisor1 = (Televisor) tem.clone();
        televisor1.setSerialTelevisor(uno);

        Televisor  televisor2 = (Televisor) tem.clone();
        televisor2.setSerialTelevisor(dos);

        Televisor  televisor3 = (Televisor) tem.clone();
        televisor3.setSerialTelevisor(tres);

        Televisor  televisor4 = (Televisor) tem.clone();
        televisor4.setSerialTelevisor(cuatro);

        Televisor  televisor5 = (Televisor) tem.clone();
        televisor5.setSerialTelevisor(cinco);
    }
}
