package Study.j8;

interface Phone{
    void call();
    default void message(){
        System.out.println("Sent");
    }
    //In java 8 we can implement the method then and there
    //If a class is implementing 2 interfaces in which all the mehtods are same
    //then diamond problem will occur as the class does not know which method to implement
    //In that case class should override the common method to avoid confusion
}

class AndroidPhone implements Phone{
    @Override
    public void call(){
        System.out.println("Calling");
    }
}

public class DemoInterface {

    public static void main(String[] args) {
        //Here by declaring the object like this we are using polymorphism, based on hte class we give it calls the respective methods
        Phone p = new AndroidPhone();
        p.call();
        p.message();
    }

}
