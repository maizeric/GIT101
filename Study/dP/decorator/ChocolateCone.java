package designpatterns.decorator;

public class ChocolateCone implements IceCream {
    //Chocolate Cone can behave base addon as well as addon
    private IceCream iceCream;
    ChocolateCone(){

    }
    ChocolateCone(IceCream iceCream){
        this.iceCream=iceCream;
    }

    @Override
    public int getCost() {
        if(iceCream!=null){
            return iceCream.getCost()+30;
        } return 10;
    }

    @Override
    public String getDescription(){
        if(iceCream!=null){
            return iceCream.getDescription()+"ChocalateCone ";
        }
        return "ChocolateCone ";
    }
}
