public class Character {
    private final int maxHealth;
    private int currentHealth;
    private final String name;
    public Character(String n , int maxh){
        this.name = n;
        this.maxHealth = maxh;
        this.currentHealth = maxh;
    }
    public int getMaxHealth(){
        return this.maxHealth;
    }
    public int getCurrentHealth(){
        return this.currentHealth;
    }
     public String getName(){
        return this.name;
    }
    @Override
    public String toString(){
        if (this.currentHealth <=  0) {
            return String.format("%s : KO",this.name);
        }
        return String.format("%s : %d/%d", this.name , this.currentHealth , this.maxHealth);
    }
    public void takeDamage(int sb){
        if (this.currentHealth - sb < 0){
            this.currentHealth = 0;
        }else {

            this.currentHealth -= sb;
        }
    }
     public void attack(Character c){
        c.takeDamage(9);
    }
}