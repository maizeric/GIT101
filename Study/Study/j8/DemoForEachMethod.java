package Study.j8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class ConsImpl implements Consumer<Integer>{
    @Override
    public void accept(Integer i) {
        System.out.println(i);
    }

}

public class DemoForEachMethod {


    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(1,2,3,4,5);

        //traditional for loop
        for(int i=0;i<values.size();i++){
            System.out.println(values.get(i));
        }

        //Enhanced for loop
        for(int i : values){
            System.out.println(i);
        }
        //The above 2 are called external for loops because

        //Internal loops in java8
        //Here forEach is an internal part of Collection
        //if we want to iterate over multiple records then this will be very helpful
        values.forEach(i->System.out.println(i));//Lambda


        //Consumer
        //Here "i->System.out.println(i)" its an object of consumer

        Consumer<Integer> c = new ConsImpl();
        values.forEach(c);

        Consumer<Integer> d = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        };

        values.forEach(d);


        List<Integer> values1 = Arrays.asList(7,8,9,10);
        //We can reduce above code to lambda expression from anonymous class
        Consumer<Integer> e = integer -> System.out.println(integer);
        values1.forEach(e);

        //if we replace e with actual implementation

        List<Integer> values2 = Arrays.asList(11,12,13,14,15);
        values2.forEach(i-> System.out.println(i));


    }
}
