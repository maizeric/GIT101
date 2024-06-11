package com.example.designpatterns.singleton.firstapproach;


public class DataBaseConnection {
    private static DataBaseConnection instance;
    private DataBaseConnection(){

    }
    public static DataBaseConnection getInstance(){
        if(instance == null){
            instance = new DataBaseConnection();
        }
        return instance;
    }

    //By this way singleton classes are implemented
    //It is fine for single threading but fails for multithreading


 }
