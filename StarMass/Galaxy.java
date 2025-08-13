import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Galaxy {
    private List<CelestialObject> celestialObjects;
    public Galaxy() {
        this.celestialObjects =  new ArrayList<>();
    }

    public List<CelestialObject> getCelestialObjects(){
        return this.celestialObjects;
    }
    public void addCelestialObject(CelestialObject c){
        this.celestialObjects.add(c);
    }
    public HashMap<String, Integer> computeMassRepartition() {
    
    HashMap<String, Integer> map = new HashMap<>();

    map.put("Star", 0);
    map.put("Planet", 0);
    map.put("Other", 0);

    for (CelestialObject obj : celestialObjects) {
        String type;
        if (obj instanceof Star) {
            type = "Star";
        } else if (obj instanceof Planet) {
            type = "Planet";
        } else {
            type = "Other";
        }

        map.put(type, map.get(type) + obj.getMass());
    }

    return map;
}

}
