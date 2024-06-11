package designpatterns.singleton.eagerloading;

public class DataBaseConnection {
    private static DataBaseConnection instance = new DataBaseConnection();
    ;
    private DataBaseConnection(){

    }
    public static DataBaseConnection getInstance(){
        return instance;
    }

    //By this way multi threading issue is solved,
    //but as the object is static so they are initialized at server startup time
    //if there are more singleton classes server up time will be more.
    //Also we cannot pass any values to the constructor
}
