package Study.dP.observer;

public class InvoiceGenerator implements OnOrderPlacedSubscriber{
    //Subscriber
    InvoiceGenerator(){
        Flipkart flipkart = Flipkart.getInstance();
        flipkart.registerSubscriber(this);
    }

    @Override
    public void announceOrderPlaced(){
        System.out.println("In Invoice Generator Service");
    }
}
