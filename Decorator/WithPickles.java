class WithPickles extends RacletteDecorator{
    public WithPickles(Raclette raclette) {
        super(raclette);
    }

    @Override
    public int getCalories() {
        return super.getRaclette().getCalories() + 50; // add pickles calories
    }

    @Override
    public String getIngredients() {
        return super.getRaclette().getIngredients() + ", cornichons";
    }
     @Override

    public String toString(){
        return String.format("%s pour %d calories", this.getIngredients(),this.getCalories());
    }
}


