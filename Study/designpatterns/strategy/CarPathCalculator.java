package designpatterns.strategy;

public class CarPathCalculator implements PathCalculatorStrategy{
    @Override
    public void findPath(String from, String to){
        System.out.println("In Car Path Calculator class");
    }
}
