package ejercicio4Builder;

public abstract class BuilderCombos {
    protected Combos combos;

    public Combos getServicio(){
        return combos;
    }

    public void createCombos(){
        this.combos = new Combos();
    }

    public abstract void buildPipocas();
    public abstract void buildRefresco();
    public abstract void buildChocolate();
}
