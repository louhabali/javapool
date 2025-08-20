import java.util.ArrayList;
import java.util.List;

public class Character {
    private final int maxHealth;
    private int currentHealth;
    private final String name;
    private static List<Character> allCharacters = new ArrayList<>();

    public Character(String n , int maxh){
        this.name = n;
        this.maxHealth = maxh;
        this.currentHealth = maxh;
        this.allCharacters.add(this);
    }
    
    public static String printStatus(){
        String p1 = "------------------------------------------";
        String p2 = "------------------------------------------";
        StringBuilder sb = new StringBuilder();
        sb.append(p1.concat("\nCharacters currently fighting :\n"));
        if (allCharacters.isEmpty()) {
            return "------------------------------------------\nNobody's fighting right now !\n------------------------------------------\n";
        }
        allCharacters.forEach(c -> {
        sb.append(String.format(" - %s\n", c.toString())) ;
        });
        sb.append(p2.concat("\n"));
        return sb.toString();
    }
    public static Character fight(Character c1 , Character c2){
        while(true){
            c1.attack(c2);
            if (c2.currentHealth<=0){
                return c1;
            }
            c2.attack(c1);
            if (c1.currentHealth<=0){
                return c2;
            }
        }
        
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