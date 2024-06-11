package designpatterns.strategy;

public class WalkPathCalculator implements PathCalculatorStrategy{

    @Override
    public void findPath(String from, String to){
        System.out.println("In WalkPath Calculator class");
    }
}
