public class DriverFactory {
    public static Driver getDriver(String ss) {
        if(ss.equals("Car")) {
            return new CarDriver();
        } else if (ss.equals("Plane")) {
            return new PlaneDriver();
        }else {
            return null;
        }
    }
}
