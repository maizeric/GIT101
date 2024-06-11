package designpatterns.strategy;

public class BikePathCalculator implements PathCalculatorStrategy{
    @Override
    public void findPath(String from, String to){
        System.out.println("In Bike Path Calculator method");
    }
}
