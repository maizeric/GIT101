package designpatterns.builder;

public class Client {
    public static void main(String[] args) {
//        Builder builder = new Builder();
//        builder.setName("Deepak");
//        builder.setPsp(90);
//        builder.setGradYear(2020);
        Student s = Student.getBuilder()
                .setName("Vipul")
                .setPsp(92)
                .setAge(30)
                .setGradYear(2020).build();
        //Student s1 = Student.build(s);

       // Student s = Student.getBuilder();

        //Here first we kept the builder class and Student class seperate but afterwards, we minimized
        //for code redundancy
        //made the return type of getter methods as Builder so we can pass all values in one go
        //made the Builder class static because static method can return only static values
        //build() is responsible for giving new student object

    }
}
