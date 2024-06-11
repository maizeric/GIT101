package Study.dP.decorator;

public class Client {
    public static void main(String args[]){
        IceCream iceCream = new ChocoChips(new StrawBerryScoop(new ChocoChips(new ChocolateCone())));

        System.out.println("THe cost is "+iceCream.getCost());
        System.out.println("The description is "+iceCream.getDescription());
    }
}
