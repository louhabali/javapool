import java.util.Objects;

public class Star extends CelestialObject {
    private double magnitude;
    public double getMagnitude(){
        return this.magnitude;
    }
    public void setMagnitude(double m){
         this.magnitude = m;
    }
     public Star(){
        super();
    }
    public Star(String name,double x ,double y ,double z , double mg){
        super.name = name;
        super.x = x;

        super.y = y;

        super.z = z;

        this.magnitude = mg;

        
    }
    @Override
    public String toString() {
        return name + " shines at the "+String.format("%.3f", magnitude)+" magnitude";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Star other = (Star) obj;
        return Double.compare(x, other.x) == 0 &&
               Double.compare(y, other.y) == 0 &&
               Double.compare(z, other.z) == 0 && Double.compare(magnitude, other.magnitude) == 0  &&
               name.equals(other.name);
    }
   @Override
    public int hashCode() {
        return  Objects.hash(x,y,z,name,magnitude);
    }
}
