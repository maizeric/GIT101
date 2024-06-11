package designpatterns.factory.components;

public class AndroidButton implements Button {
    @Override
    public void showbutton() {
        System.out.println("Android button");
    }
}
