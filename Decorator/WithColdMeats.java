public class WithColdMeats extends RacletteDecorator {

    public WithColdMeats(Raclette raclette) {
        super(raclette);
    }

    @Override
    public int getCalories() {
        return super.getRaclette().getCalories() + 350; 
    }

    @Override
    public String getIngredients() {
        return super.getRaclette().getIngredients() + ", charcuterie";
    }
    @Override

    public String toString(){
        return String.format("%s pour %d calories", this.getIngredients(),this.getCalories());
    }
}
