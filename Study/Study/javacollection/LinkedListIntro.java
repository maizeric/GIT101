package Study.javacollection;

import java.util.LinkedList;

//LinkedList is a doubly linked list implementation of the list and deque interfaces. It implements all
//optional list operations and permits all elements including null.
//Here we can insert elements at first or last
public class LinkedListIntro {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add("Srikanth");
        linkedList.add(1);
        linkedList.stream().forEach(i-> System.out.println(i));
    }
}
