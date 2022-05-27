package ejercicio4Builder;

public class PaqueteNormal extends BuilderCombos{
    @Override
    public void buildPipocas(){
        this.combos.setPipocas("pipocas en envase normal");
    }

    public void buildRefresco(){
        this.combos.setRefresco("1 refresco");
    }

    public void buildChocolate(){
        this.combos.setChocolate("no cuenta con chocolates");
    }
}
