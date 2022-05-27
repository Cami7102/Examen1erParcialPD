package ejercicio4Builder;

public class PaqueteMediano extends BuilderCombos{

    @Override
    public void buildPipocas(){
        this.combos.setPipocas("pipocas grandes");
    }

    public void buildRefresco(){
        this.combos.setRefresco("2 vasos de refrescos");
    }

    public void buildChocolate(){
        this.combos.setChocolate("1 chocolate");
    }
}
