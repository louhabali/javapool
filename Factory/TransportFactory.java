public class TransportFactory {
    public static Transport getTransport(String ss) {
        if (ss.equals("Car")) {
            return new Car();
        } else if (ss.equals("Plane")) {
            return new Plane();
        }else {
            return null;
        }
        
    }
}