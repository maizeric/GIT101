package com.example.designpatterns.builder;

public class Student {
    private String name;
    private int age;
    double psp;
    String universityName;
    long id;
    int gradYear;
    String phoneNumber;

    Student(Builder builder){
        //Valdiations start
        if(builder.gradYear>2022){
            throw new IllegalArgumentException("Grad Year cant be greater than 2022");
        }
        //Validations end
        this.name = builder.getName();
        this.age = builder.getAge();

    }
}
