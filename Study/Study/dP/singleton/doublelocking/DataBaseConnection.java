package Study.dP.singleton.doublelocking;


public class DataBaseConnection {
    private static DataBaseConnection dataBaseConnection = null;
    private DataBaseConnection(){

    }
    public static DataBaseConnection getdataBaseConnection(){
        if(dataBaseConnection == null){//I.Check
            synchronized (DataBaseConnection.class) {//II.Lock
                if (dataBaseConnection == null) {//III.check
                    dataBaseConnection = new DataBaseConnection();
                }
            }
        }
        return dataBaseConnection;
    }

    //will work in multithreaded environment

    
 }
