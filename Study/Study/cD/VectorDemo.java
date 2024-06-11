package Study.cD;

import java.util.Vector;

//Vector->Dynamic Array
//Vector is present from 1.0 and collection framework is there from 1.2

public class VectorDemo {
    public static void main(String[] args) {
        //Vector is similar to ArrayList
        Vector v = new Vector<>();
        v.add(1);
        v.add(2);

        v.add(1);
        v.add(2);
        v.add(1);
        v.add(2);
        v.add(1);
        v.add(2);
        v.add(1);
        v.add(2);
        v.add(1);
        v.add(21);
        v.add(1);
        v.add(2);

        v.add(1);
        v.add(2);
        v.add(1);
        v.add(2);
        v.add(11);
        v.add(2);
        v.add(2);

        //the capacity of the vector is doubled each time it needs to grow.
        System.out.println("Capacity of vector v is "+v.capacity());

        System.out.println("Iterating through vector");
        v.forEach(i-> System.out.println(i));

        System.out.println("When to use vector and when to use collection?");
        //Vector increases its capacity by 100%
        //but list increases its capacity by 50% - so we are saving memory here


        //Theoretically vectors are thread safe as all methods are synchronized -hence it is slow
        //Arraylist is not threadsafe - hence it is fast


        //if they ask you to work with vectors then only work with them else go for Arraylist
    }
}
