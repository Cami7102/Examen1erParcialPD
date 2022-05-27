package ejercicio4Builder;

public class Combos {
    private String pipocas;
    private String refresco;
    private String chocolate;

    public Combos(){}

    public String getPipocas() {
        return pipocas;
    }

    public void setPipocas(String pipocas) {
        this.pipocas = pipocas;
    }

    public String getRefresco() {
        return refresco;
    }

    public void setRefresco(String refresco) {
        this.refresco = refresco;
    }

    public String getChocolate() {
        return chocolate;
    }

    public void setChocolate(String chocolate) {
        this.chocolate = chocolate;
    }

    public void showInfo(){
        System.out.println("Pipocas: " +pipocas);
        System.out.println("Refresco: " +refresco);
        System.out.println("Chocolate: " +chocolate);
    }
}
