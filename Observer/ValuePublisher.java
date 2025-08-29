import java.util.*;
public class ValuePublisher {   
    private List<NumericBaseObserver> observers = new ArrayList<>();
    public void updateState(int value){
        if (observers != null){
            observers.forEach(ob -> {
                ob.updateState(value);
            });
        }
    }
    public void subscribe(NumericBaseObserver observer){
        this.observers.add(observer);
    }
    public void unsubscribe(NumericBaseObserver observer){
        observers.remove(observer);
    }
}
