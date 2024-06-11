package Study.cD;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparator<Student> {
    int rollNo;
    int marks;
    Student(int rollNo, int marks){
        this.rollNo=rollNo;
        this.marks = marks;
    }

    Student(){

    }
    @Override
    public int compare(Student s1, Student s2) {
        return s1.marks-s2.marks;
    }
}

public class ComparatorStudent {

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1,55));
        studentList.add(new Student(2, 65));
        studentList.add(new Student(3,45));

        Comparator<Student> comp1 = new Student();

        Collections.sort(studentList, comp1);

        studentList.forEach(s-> System.out.println(s.rollNo+" "+s.marks));



    }
}
