import java.util.*;
public class DecimalBaseObserver implements NumericBaseObserver {
    private List<String> events= new ArrayList<>();
    @Override
    public void updateState(int state){
        this.events.add(String.valueOf(state));
    }
    @Override
    public List<String> getEvents() {
        return this.events;
    }
}