package Study.dP.strategy;

public class Client {
    public static void main(String[] args) {
        GoogleMaps googleMaps = new GoogleMaps();
        googleMaps.findPath("Toopran", "Hyderabad", "Bike");
    }
}
