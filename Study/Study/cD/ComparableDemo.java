package Study.cD;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student1 implements Comparable<Student1> {
    int rollNo;
    int marks;
    Student1(int rollNo, int marks){
        this.rollNo=rollNo;
        this.marks = marks;
    }

    Student1(){

    }
    @Override
    public int compareTo(Student1 s1) {
        return this.marks-s1.marks;
    }
    //This method is from Comparable Interface.It takes one argument and compare with existing object
    //In Comparator interface -> compare(Object o1, Object o2)
    //In comparable interface -> compareTo(Object o);

    //When to use what
    //Custom class go for Comparable Interface compareTo() method
    //Inbuilt class go for Comparator Interface compare() method
}

public class ComparableDemo {

    public static void main(String[] args) {
        List<Student1> studentList = new ArrayList<>();
        studentList.add(new Student1(1,55));
        studentList.add(new Student1(2, 65));
        studentList.add(new Student1(3,45));

        Comparable<Student1> comp1 = new Student1();

        Collections.sort(studentList);

        studentList.forEach(s-> System.out.println(s.rollNo+" "+s.marks));



    }
}
