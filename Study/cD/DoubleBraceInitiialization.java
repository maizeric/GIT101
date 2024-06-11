package collectionDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DoubleBraceInitiialization {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.forEach(i-> System.out.println(i));
        //Normal way of adding elements

        //if we know the elements then and there
        List<Integer> list1 = Arrays.asList(1,2,3);
        list1.forEach(i-> System.out.println(i));

        List<Integer> list2 = new ArrayList<Integer>()
        {{
            add(56);
            add(23);
            add(45);
        }};
        list2.forEach(i-> System.out.println(i));
    }
}
