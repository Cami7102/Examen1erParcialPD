package ejercicio4Builder;

public class MegaPaquete extends BuilderCombos{

    @Override
    public void buildPipocas(){
        this.combos.setPipocas("pipocas extragrandes");
    }

    public void buildRefresco(){
        this.combos.setRefresco("3 vasos de gaseosas extragrandes con recarga ilimitada");
    }

    public void buildChocolate(){
        this.combos.setChocolate("2 chocolates grandes");
    }
}
