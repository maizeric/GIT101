package java8;

interface A{
    void show(int i);
}

class Xyz implements A{
    @Override
    public void show(int i){
        System.out.println("hello");
    }
    //Here the main purpose of the class is to implement the method show()
    //So instead of this we can define the method then and there
}

public class DemoLambda {
    public static void main(String[] args) {
        A obj =new Xyz();
        obj.show(2);

        //By using anonymous class
        A obj1 = new A()
        {
            public void show(int i){
                System.out.println("Hi");
            }
        };//Creates an anonymous class in target folder with name DemoLambda$1.class
        obj1.show(4);

        //WIth the help of lambda expression not only boiler plate code is reduced but also
        //creation of inner class is minimized
        //Simplifying further
        A obj2=(i)-> System.out.println("Bye");
        obj2.show(2);

        A obj3=i-> System.out.println("Hru");
        obj3.show(4);
    }
}
