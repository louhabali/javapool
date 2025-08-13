import java.util.Objects;

public class Planet extends CelestialObject {
    private Star centerStar;

    public Planet() {
        super();
        this.centerStar = new Star();
    }

    public Planet(String name, double x, double y, double z, Star centerStar,int m) {
        setName(name);
        setX(x);
        setY(y);
        setZ(z);
        setMass(m);
        this.centerStar = centerStar;
    }

    public Star getCenterStar() {
        return centerStar;
    }

    public void setCenterStar(Star centerStar) {
        this.centerStar = centerStar;
    }
      @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Planet other = (Planet) obj;
        //Planet otherp = (Planet) obj;
        return Double.compare(x, other.x) == 0 &&
               Double.compare(y, other.y) == 0 &&
               Double.compare(z, other.z) == 0 && 
               this.centerStar.equals(other.centerStar) &&
               name.equals(other.name);
    }
   @Override
    public int hashCode() {
        return  Objects.hash(x,y,z,name,centerStar);
    }
    @Override
    public String toString() {
        return String.format("%s circles around %s at the %.3f AU", name, centerStar.name, getDistanceBetween(this, centerStar));
    }

}
