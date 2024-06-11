package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


interface Parser{
    String parse(String str);
}

class StringParser{
    public static String convert(String s){
        if(s.length()<=3)
            s=s.toLowerCase();
        else
            s=s.toUpperCase();
        return s;
    }
}
class MyPrinter{
    public void print(String str, Parser p){
        p.parse(str);
        System.out.println(str);
    }
}

public class FirstCode {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Srikanth", "Gopal", "Vinoda");

        Consumer<String> c = s -> System.out.println(s);

        //Print all the names
        //Here we are fetching the values from names and printing
        names.forEach(name->System.out.println(name));


        //Call by method
        names.forEach(System.out::println);//whatever the value I will be getting from for each I will just be printing

        //What if we need customized method reference


        String str = "Srikanth";
        MyPrinter myPrinter = new MyPrinter();
        Parser parser;
        myPrinter.print(str, new Parser() {
            @Override
            public String parse(String str) {
                return StringParser.convert(str);
            }
        });
        //can be minimized like this

        myPrinter.print(str, str1 -> StringParser.convert(str1));
        myPrinter.print(str, StringParser::convert);


        System.out.println("Practicing");
        MyPrinter myPrinter1 = new MyPrinter();
        Parser parser1 = new Parser() {
            @Override
            public String parse(String str) {
                return str;
            }
        };
        myPrinter1.print("Sri",parser1 );

    }
}
