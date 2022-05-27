package Ejercicio2Prototype;

public class Televisor {
    private String sistemaOperativo;
    private int versiónSistemaOperativo;
    private int pulgadas;
    private int resolucion;
    private Boolean puertoHDMI;
    private int puertosUSB;
    private Boolean controlRemoto;
    private Boolean bluetooth;
    private int serialTelevisor;

    public Televisor(){
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public int getVersiónSistemaOperativo() {
        return versiónSistemaOperativo;
    }

    public void setVersiónSistemaOperativo(int versiónSistemaOperativo) {
        this.versiónSistemaOperativo = versiónSistemaOperativo;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public Boolean getPuertoHDMI() {
        return puertoHDMI;
    }

    public void setPuertoHDMI(Boolean puertoHDMI) {
        this.puertoHDMI = puertoHDMI;
    }

    public int getPuertosUSB() {
        return puertosUSB;
    }

    public void setPuertosUSB(int puertosUSB) {
        this.puertosUSB = puertosUSB;
    }

    public Boolean getControlRemoto() {
        return controlRemoto;
    }

    public void setControlRemoto(Boolean controlRemoto) {
        this.controlRemoto = controlRemoto;
    }

    public Boolean getBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(Boolean bluetooth) {
        this.bluetooth = bluetooth;
    }

    public int getSerialTelevisor() {
        return serialTelevisor;
    }

    public void setSerialTelevisor(int serialTelevisor) {
        this.serialTelevisor = serialTelevisor;
    }

    @Override
    public Object clone(){
        Televisor clone = new Televisor();
        clone.setSistemaOperativo(this.getSistemaOperativo());
        clone.setVersiónSistemaOperativo(this.getVersiónSistemaOperativo());
        clone.setPulgadas(this.getPulgadas());
        clone.setResolucion(this.getResolucion());
        clone.setPuertoHDMI(this.getPuertoHDMI());
        clone.setPuertosUSB(this.getPuertosUSB());
        clone.setControlRemoto(this.getControlRemoto());
        clone.setBluetooth(this.getBluetooth());
        clone.setSerialTelevisor(this.getSerialTelevisor());
        return clone;
    }
}
