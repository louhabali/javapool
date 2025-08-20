public class Sorcerer extends Character implements Healer {
    private final int healCapacity;
    public Sorcerer(String n,int mx,int hc){
        super(n, mx);
        this.healCapacity = hc;
    }
    @Override
    public int getHealCapacity(){
        return this.healCapacity;
    }
    @Override
      public void heal(Character c){
        c.setCurrent(this.healCapacity);
          
      }
       @Override
    public String toString(){
        if (super.getCurrentHealth() ==  0) {
            return String.format("%s is a dead sorcerer. So bad, it could heal %d HP.",super.getName(),this.healCapacity);
        }
        return String.format("%s is a sorcerer with %d HP. It can heal %d HP.", super.getName() , super.getCurrentHealth() , this.healCapacity);
    }


}