package java8;
interface TestInterface {
    boolean test(int a);
}
class Test {
    // lambda expression can be passed as first argument in the check() method
    static boolean check(TestInterface ti, int b) {
        return ti.test(b);
        //We can understand in such a way that the object of interface will have the implementation of test() method.
        //So while passing the object, we are simply passing the implementation.
    }
}
public class PassingInterfaceAsParam {
        public static void main(String arg[]) {
            // lambda expression
            boolean result = Test.check((x) -> (x%2) == 0, 11);

            TestInterface testInterface = a ->{return a%2==0;};
            System.out.println("The result is: "+ result);
        }
}
