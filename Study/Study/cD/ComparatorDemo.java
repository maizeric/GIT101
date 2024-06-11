package Study.cD;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(881);
        list.add(339);
        list.add(555);
        list.add(238);
        System.out.println("Sorting in ascending order");
        //Collections.sort(list);
        //list.forEach(i-> System.out.println(i));

        Comparator<Integer> comp = new ComparatorImpl();

        Collections.sort(list,comp);

        list.forEach(i-> System.out.println(i));


        System.out.println("Sort based on last digit");

        Collections.sort(list, (i1,i2)-> i1%10>i2%10?1:-1);

        list.forEach(i-> System.out.println(i));


    }
}
