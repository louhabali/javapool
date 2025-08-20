public class Monster extends Character {
    public Monster(String n , int mxh,Weapon w){
        super(n,mxh,w);
    }

    @Override
    public String toString(){
        if (super.getCurrentHealth() <=  0) {
            return String.format("%s is a monster and is dead. He has the weapon %s",super.getName(),super.getWeapon().toString());
        }
        return String.format("%s is a monster with %d HP. He has the weapon %s", super.getName(),super.getCurrentHealth(),super.getWeapon().toString());
    }
    @Override
    public void takeDamage(int sb){
     
        super.setCurrentdmg((int) Math.floor((sb*0.8)));
        
    }

    @Override
    public void attack(Character c){
        if (super.getWeapon() != null){
        c.takeDamage(super.getWeapon().getDamage());

        }else {

            c.takeDamage(7);
        }
    }
}
