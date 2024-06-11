package com.example.designpatterns.singleton.eagerloading;

public class DataBaseConnection {
    private static DataBaseConnection instance;
    ;
    private DataBaseConnection(){

    }
    public static DataBaseConnection getInstance(){
        if(instance == null){
            instance = new DataBaseConnection();
        }
        return instance
    }

    //By this way multi threading issue is solved,
    //but as the object is static so they are initialized at server startup time
    //if there are more singleton classes server up time will be more.
    //Also we cannot pass any values to the constructor
}
