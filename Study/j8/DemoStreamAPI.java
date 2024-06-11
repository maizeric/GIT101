package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class DemoStreamAPI {
    public static void main(String[] args) {
        List<Integer> nums= Arrays.asList(5,7,9,2,4,6);
        Stream<Integer> data = nums.stream();
        //Parallel Stream->if you have huge amount of data and if you wnat to use multiple threads then we can make use of parallelstream
        //In case if hte value of one operation is required for another then parallel stream might not be required
//Advantages of using stream-> 1)Basically we should not be touching original list, so in that cases it can be useful
//2)Once we consume the stream we cannot use it anymore
        //data.forEach(n-> System.out.println(n));
        //data.forEach(n-> System.out.println(n));
        //Gives exception that stream has been operated upon or close
        //By this we can avoid data leakage when working with large amount of data
        Long count =data.count();//Same exception we will get if we try to consume stream
        System.out.println(count);


        Stream<Integer> sortedData = nums.stream().sorted();
        sortedData.forEach(num-> System.out.println(num));

        //If you want to multiply the data by 2
        //By using enhanced for loop
        System.out.println("Enhanced for loop");
        for(int i:nums){
            System.out.println(i*2);
        }

        //Using stream to print the numbers which is multiplied by2
        System.out.println("Stream API");
        Stream<Integer> data2=nums.stream();
        Stream<Integer> mappedData = data2.map(n->n*2);
        //Think the above map as f(x)=x*2;
        //Means whatever we give to map it will multiply and gives us result
        mappedData.forEach(n->System.out.println(n));

        //Combining all operations in one line
        System.out.println("Combining all operations in one line");
        nums.stream().map(i->i*2).forEach(System.out::println);

        //Here above 3 times we are making stream but that is fine, because once we process
        //the stream it is gone, so should be fine

        System.out.println("Using filter");
        //I want to perform the operation of doubling only on odd numbers
        nums.stream().filter(i->i%2==1).map(i->i*2).forEach(i-> System.out.println(i));
        //Elaboarating predicate
        System.out.println("Predicate");

        Predicate<Integer> pred = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                if(integer%2==1)
                    return true;
                return false;
            }
        };

        Function<Integer,Integer> fun = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer i) {
                return i*2;
            }
        };
        Consumer<Integer> cons = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        };

        nums.stream().filter(pred).map(fun).forEach(cons);

        //Need the addition of all elements
        System.out.println("Addition of eleements");
        //int sum = nums.stream().reduce(0,(c,e)->c+e);

        BinaryOperator<Integer> binaryOperator = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer+integer2;
            }
        };

        int sum = nums.stream().reduce(0, binaryOperator);

        System.out.println("Addition is "+sum);
    }
}
