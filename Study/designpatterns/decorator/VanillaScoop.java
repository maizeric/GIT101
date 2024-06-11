package designpatterns.decorator;

public class VanillaScoop implements IceCream{

    private IceCream iceCream;
    public VanillaScoop(IceCream iceCream){
        this.iceCream = iceCream;
    }

    @Override
    public int getCost(){
        if (iceCream != null) {//It is good to check null pointer exception
            return iceCream.getCost()+20;
        }
        return 0;
    }

    @Override
    public String getDescription(){
        if(iceCream!=null){
            return iceCream.getDescription()+"Vanilla Scoop ";
        }
        return "";
    }
}
