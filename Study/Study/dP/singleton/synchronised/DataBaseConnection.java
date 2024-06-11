package Study.dP.singleton.synchronised;

public class DataBaseConnection {
    private static DataBaseConnection instance;
    private DataBaseConnection(){

    }
    public static synchronized DataBaseConnection getInstance(){
        if(instance == null){
            instance = new DataBaseConnection();
        }
        return instance;
    }

    //This solution is fine for multithreading

    //Issues:-
    //if more threads are there then waiting time is more hence slower performance

}
