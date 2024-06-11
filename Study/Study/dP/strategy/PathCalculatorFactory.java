package Study.dP.strategy;

public class PathCalculatorFactory {


    static CarPathCalculator carPathCalculator = new CarPathCalculator();
    static BikePathCalculator bikePathCalculator = new BikePathCalculator();
    static WalkPathCalculator walkPathCalculator = new WalkPathCalculator();
    public static PathCalculatorStrategy getPathCalculatorForMode(String mode){

        if(mode.equals("Car")){
            return carPathCalculator;
        } else if(mode.equals("Bike")){
            return bikePathCalculator;
        } else if(mode.equals("Walk")){
            return walkPathCalculator;
        }
        return null;
    }
}
