package Study.dP.observer;

import java.util.ArrayList;
import java.util.List;

public class Flipkart {

    //Publisher
    private static Flipkart instance = null;
    private List<OnOrderPlacedSubscriber> onOrderPlacedSubscriberList = new ArrayList<>();
    private Flipkart(){

    }
    public static Flipkart getInstance(){
        if(instance == null){
            instance = new Flipkart();
        }
        return instance;
    }
    void registerSubscriber(OnOrderPlacedSubscriber onOrderPlacedSubscriber){
        onOrderPlacedSubscriberList.add(onOrderPlacedSubscriber);
    }
    void unRegisterSubscriber(OnOrderPlacedSubscriber onOrderPlacedSubscriber){
        onOrderPlacedSubscriberList.remove(onOrderPlacedSubscriber);
    }

    public void onOrderPlaced(){
        for(OnOrderPlacedSubscriber onOrderPlacedSubscriber:onOrderPlacedSubscriberList){
            onOrderPlacedSubscriber.announceOrderPlaced();
        }
    }
}
