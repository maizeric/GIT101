package Study.cD;


import com.simba.spark.jdbc42.internal.apache.arrow.flatbuf.Int;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

//Java first version -1.0
//Collection -1.2
//Generics - 1.5

//iterator
//enhanced for loop
public class CollectionGenerics {
    public static void main(String[] args) {
        int nums[] = new int[4];
        nums[0]=1;
        nums[1]=2;

        Object object[] = new Object[4];
        object[0]=1;
        object[1]="sri";

        Collection values=new ArrayList();
        values.add(1);
        values.add("Sri");
        values.add(1.5);


        //To fetch the values from collection we can use iterator

        Iterator i = values.iterator();//returns an iterator object
        //Assume i is present at -1 index at start
        System.out.println(i.next());//gives us the next element
        System.out.println(i.next());
        System.out.println(i.next());

        //If we want to print the elements we are writing 3 times
        //ANy alternative?
        System.out.println("Iterator");
        Iterator i1 = values.iterator();
        while(i1.hasNext()){
            System.out.println(i1.next());
        }
        System.out.println("Enhanced for loop");
        //Enhanced for loop
        for(Object j:values){
            System.out.println(j);
        }

        //Now if we want to store the elements of same type in collection we can do by generics
        Collection<Integer> collection =new ArrayList<>();
        collection.add(1);
        collection.add(2);
        collection.add(4);
       // collection.add("Sri");//Gives error
        //collection.add(3,3);//Gives error we cannot insert the element at specific position using collection interface
        //But same can be done through list interface

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(2,3);
        System.out.println("Iteraring through list");
        Iterator<Integer> listIterator = list.iterator();
        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

        System.out.println("Using for each loop");
        //using for each loop
        list.forEach(System.out::println);


    }
}
