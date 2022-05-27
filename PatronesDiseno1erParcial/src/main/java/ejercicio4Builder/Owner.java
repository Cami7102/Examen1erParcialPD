package ejercicio4Builder;

public class Owner {
    private BuilderCombos builder;

    public Combos getComboListo(){
        return builder.getServicio();
    }

    public void setBuilder(BuilderCombos builder){
        this.builder = builder;
    }

    public void prepararCombo(){
        this.builder.createCombos();
        this.builder.buildPipocas();
        this.builder.buildRefresco();
        this.builder.buildChocolate();
    }
}
