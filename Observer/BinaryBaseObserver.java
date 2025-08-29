import java.util.*;
public class BinaryBaseObserver implements NumericBaseObserver {
    private List<String> events = new ArrayList<>();
    @Override
    public void updateState(int state){
        String bin = Integer.toBinaryString(state);
        this.events.add(bin);
    };
    @Override
    public List<String> getEvents(){
        return this.events;
    }
}