package designpatterns.decorator;

public class OrangeCone implements IceCream{

    //Orange cone acts as ony base
    @Override
    public int getCost(){
        return 10;
    }

    @Override
    public String getDescription(){
        return "Orange Cone ";
    }
}
