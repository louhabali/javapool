public class Monster extends Character {
    public Monster(String n , int mxh){
        super(n,mxh);
    }

    @Override
    public String toString(){
        if (super.getCurrentHealth() <=  0) {
            return String.format("%s is a monster and is dead",super.getName());
        }
        return String.format("%s is a monster with %d HP", super.getName(),super.getCurrentHealth());
    }
}
