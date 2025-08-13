public class CelestialObject {
    public double x;
    public double y;
    public double z;
    public String name;
    public static final double KM_IN_ONE_AU = 150000000;
    public CelestialObject() {
        x = 0.0;
        y = 0.0;
        z = 0.0;
        name = "Soleil";
    }
    public CelestialObject(String name,double x,double y,double z) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.name = name;
    }
    public static double getDistanceBetween(CelestialObject a , CelestialObject b){
        double dx = b.x - a.x;
        double dy = b.y - a.y;
        double dz = b.z - a.z;
        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }
    public static double getDistanceBetweenInKm(CelestialObject c , CelestialObject d){
        double normaldis = getDistanceBetween(c, d);
        return normaldis * KM_IN_ONE_AU;
    }
    
    public double getX(){
        return this.x;
    }
    public double getY(){
        return this.y;
    }
    public double getZ(){
        return this.z;
    }
    public String getName(){
        return this.name;
    }
    public void setX(double x){
        this.x = x;
    }
    public void setY(double y){
        this.y = y;
    }
    public void setZ(double z){
        this.z = z;
    }
    public void setName(String name){
        this.name = name;
    }
}