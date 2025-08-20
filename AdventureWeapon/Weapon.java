
public class Weapon {
    private final String name;
    private final int damage;
    public Weapon(String n , int dmg){
        this.name = n;
        this.damage = dmg;
    }
    public String getName(){
        return this.name;
    }
    public int getDamage(){
        return this.damage;
    }
    @Override
    public String toString(){
        return String.format("%s deals %d damages", this.name , this.damage);
    }
}
