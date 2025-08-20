public class Templar extends Character implements Tank , Healer {
    private final int healCapacity;
    private final int shield;

    public Templar(String n , int mxh ,int hcp , int sh,Weapon w) {
        super(n,mxh,w);
        this.healCapacity = hcp;
        this.shield = sh;
    }
    @Override
    public void heal(Character c) throws  DeadCharacterException{
        if (super.getCurrentHealth()==0){
            throw new DeadCharacterException(this);
        }
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
            return String.format("%s has been beaten, even with its %d shield. So bad, it could heal %d HP. He has the weapon %s",super.getName(),shield,healCapacity,super.getWeapon().toString());
        }
        return String.format("%s is a strong Templar with %d HP. It can heal %d HP and has a shield of %d. He has the weapon %s", super.getName(),super.getCurrentHealth(), healCapacity ,shield,super.getWeapon().toString());
    }
     @Override
    public void takeDamage(int sb)throws DeadCharacterException{
        if (super.getCurrentHealth()==0){
            throw new DeadCharacterException(this);
        }
            if (super.getCurrentHealth() - (sb-shield) < 0){
            this.setCurrentHealth(0);
        }else {
            this.setCurrent(-sb+shield); 
        }
        
        
        
    }
    @Override
     public void attack(Character c)throws DeadCharacterException{
        if (super.getCurrentHealth()==0){
            throw new DeadCharacterException(this);
        }
        this.heal(this);
        if (super.getWeapon() != null){
        c.takeDamage(super.getWeapon().getDamage());

        }else {
        c.takeDamage(6);
        }
    }
}
