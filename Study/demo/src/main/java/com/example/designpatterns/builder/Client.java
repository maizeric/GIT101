package com.example.designpatterns.builder;

public class Client {
    public static void main(String[] args) {
        Builder builder = new Builder();
        builder.setName("Deepak");
        builder.setPsp(90);
        builder.setGradYear(2023);
        Student s = new Student(builder);
    }
}
