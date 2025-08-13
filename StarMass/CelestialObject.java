
import java.util.Objects;

public class CelestialObject {
    public double x;
    public double y;
    private int mass;
    public double z;
    public String name;
    public static final double KM_IN_ONE_AU = 150000000;

    public CelestialObject() {
        x = 0.0;
        y = 0.0;
        z = 0.0;
        name = "Soleil";
        mass = 0;
    }

    public CelestialObject(String name, double x, double y, double z,int m) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.name = name;
        this.mass = m;
    }
     public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
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
      public static double getDistanceBetween(CelestialObject a , CelestialObject b){
        if (a == null || b == null) return  0.0;
        double dx = b.x - a.x;
        double dy = b.y - a.y;
        double dz = b.z - a.z;
        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }
    public static double getDistanceBetweenInKm(CelestialObject c , CelestialObject d){
        double normaldis = getDistanceBetween(c, d);
        return normaldis * KM_IN_ONE_AU;
    }
    @Override
    public String toString() {
        return name + " is positioned at (" + String.format("%.3f", x)  + ", " + String.format("%.3f", y) + ", " + String.format("%.3f", z) + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        CelestialObject other = (CelestialObject) obj;
        return Double.compare(x, other.x) == 0 &&
               Double.compare(y, other.y) == 0 &&
               Double.compare(z, other.z) == 0 &&
               name.equals(other.name);
    }

   @Override
    public int hashCode() {
        return  Objects.hash(x,y,z,name);
    }

}
