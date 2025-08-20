
public class DeadCharacterException extends Exception{
    private Character character;
    public DeadCharacterException(Character c){
        this.character = c;
    }
     @Override
    public String getMessage() {
        String type = "";
        if (character instanceof Sorcerer) {
            type = "sorcerer";
        } else if (character instanceof Monster) {
            type = "monster";
        } else if (character instanceof Templar) {
            type = "templar";
        }
        return "The " + type + " " + character.getName() + " is dead.";
    }
}
