package collectionDemo;

import java.util.ArrayList;
import java.util.Collection;

class Container<T>{
    T value;//T should be of only class it cannot be int,float
    public void show(){
        System.out.println("The type of value is "+value.getClass());
    }
}

class Container1<T extends Number>{
    T value;//Here T can be any class which is already extending Number class
    //It cannot be other than that
    public void show(){
        System.out.println("The type for value is "+value.getClass());
    }

    public void demo(ArrayList<? extends Number> list){
        //?-> indicates it can be of any class which is extending Number class
        System.out.println("ArrayList contains elements of type "+list.get(0).getClass());
    }

    public void demoSuper(ArrayList<? super T> list){
        //ANy super class of T can be the type
        System.out.println("THe elements are of type "+list.get(0).getClass());
    }
}

public class GenericsDemo {

    public static void main(String[] args) {
        int value =5;
        //if we want to assign any value we need to declare type otherwise it
        //throws compilation error->it is called type safety

        Collection values = new ArrayList();
        values.add(5);
        values.add(8);
        values.add("Srikanth");
        //Type safety is not followed here as we didnt mention type of variable
        //To mention we need to use generics

        Collection<Integer> values1 = new ArrayList<>();
        values1.add(1);
        values1.add(2);
        values1.add(3);

        //We can custom generics
        Container<String > cont = new Container<>();
        cont.value="Sri";
        cont.show();

        Container1<Integer> cont1 = new Container1<>();
        cont1.value=5;
        cont1.show();

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        cont1.demo(list);

        ArrayList<Number> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(2.5);
        cont1.demoSuper(list1);


    }


}
