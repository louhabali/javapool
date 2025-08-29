import java.util.*;
public class HexaBaseObserver implements NumericBaseObserver {
    private List<String> events= new ArrayList<>();
    @Override
    public void updateState(int state){
        String ss = Integer.toHexString(state);
        this.events.add(ss);
    }
    @Override
    public List<String> getEvents() {
        return this.events;
    }
}