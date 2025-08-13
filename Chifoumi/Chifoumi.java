//package Chifoumi;

public class Chifoumi {
    public static ChifoumiAction getActionBeatenBy(ChifoumiAction chifoumiAction) {
        switch (chifoumiAction) {
            case ROCK:
                return chifoumiAction.SCISSOR;
            case PAPER :
                return chifoumiAction.ROCK;
            default:
            return chifoumiAction.PAPER;
        }
    }
}
