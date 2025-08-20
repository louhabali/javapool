public class Sorcerer extends Character implements Healer {
    private final int healCapacity;
    public Sorcerer(String n,int mx,int hc,Weapon w){
        super(n, mx,w);
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
    public void takeDamage(int sb){
        this.heal(this);
       
        super.setCurrentdmg(sb);
        
    }
    @Override
     public void attack(Character c){
        this.heal(this);
        if (super.getWeapon() != null){
        c.takeDamage(super.getWeapon().getDamage());

        }else {
        c.takeDamage(10);
        }
    }
       @Override
    public String toString(){
        if (super.getCurrentHealth() ==  0) {
            return String.format("%s is a dead sorcerer. So bad, it could heal %d HP. He has the weapon %s",super.getName(),this.healCapacity,super.getWeapon().toString());
        }
        return String.format("%s is a sorcerer with %d HP. It can heal %d HP. He has the weapon %s", super.getName() , super.getCurrentHealth() , this.healCapacity,super.getWeapon().toString());
    }


}