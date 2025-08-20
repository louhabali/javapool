public class Templar extends Character implements Tank , Healer {
    private final int healCapacity;
    private final int shield;

    public Templar(String n , int mxh ,int hcp , int sh) {
        super(n,mxh);
        this.healCapacity = hcp;
        this.shield = sh;
    }
    @Override
    public void heal(Character c){
        c.setCurrent(healCapacity);
    };
    @Override
    public int getHealCapacity(){
        return healCapacity;
    };
    @Override
    public int getShield(){
        return shield;
    };
    @Override
    public String toString(){
        if (super.getCurrentHealth() <=  0) {
            return String.format("%s has been beaten, even with its %d shield. So bad, it could heal %d HP.",super.getName(),shield,healCapacity);
        }
        return String.format("%s is a strong Templar with %d HP. It can heal %d HP and has a shield of %d.", super.getName(),super.getCurrentHealth(), healCapacity ,shield);
    }
     @Override
    public void takeDamage(int sb){
        if (super.getCurrentHealth() - (sb-shield) < 0){
            this.setCurrentHealth(0);
        }else {
            this.setCurrent(-sb+shield); 
        }
    }
    @Override
     public void attack(Character c){
        this.heal(this);
        c.takeDamage(6);
    }
}
