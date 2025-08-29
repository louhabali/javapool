public abstract class RacletteDecorator implements Raclette {
    private Raclette raclette;
    public RacletteDecorator(Raclette raclette){
        this.raclette = raclette;
    }
    public Raclette getRaclette(){
        return this.raclette;
    }
    @Override
    public abstract  int getCalories();
    @Override
    public abstract String getIngredients();
}