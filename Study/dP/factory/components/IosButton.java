package designpatterns.factory.components;

public class IosButton implements Button {
    @Override
    public void showbutton() {
        System.out.println("IOS Button");
    }
}
