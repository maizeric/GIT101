package collectionDemo;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

//In Set only unique elements are presnt while in list duplicate elements are also prestn
//It is implemented by HashSet class wich uses hashing
//So wile iterating the nearest value might  come fast
//Hence ordering is not maintained in set

public class SetInterfaceDemo {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1010);
        set.add(22);
        set.add(3222);
        set.add(null);
        set.add(null);
        System.out.println("Printing elements of Set");
        set.forEach(s-> System.out.println(s));
        //In HashSet we can store null elements where as in treeset we cannot store null elements
        //If we want to store in ascending order use TreeSet
        System.out.println("Storing elements in ascending order");
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(10);
        //treeSet.add(null);
        treeSet.add(6);
        treeSet.forEach(t-> System.out.println(t));
    }
}
