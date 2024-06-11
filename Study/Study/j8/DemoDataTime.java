package Study.j8;

//What are the problems with old DateTime api
//Note down the differences here
//todo

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;

public class DemoDataTime {
    public static void main(String[] args) {
        LocalDate d = LocalDate.now();
        System.out.println(d);//It gives us only date
        //previous one used to give date and time as well

        d= LocalDate.of(1998, 6,19);
        System.out.println(d);//prints given data

        LocalTime t = LocalTime.now();
        System.out.println(t);//gives our local current time

        t = LocalTime.of(12,35,10,199);
        System.out.println(t);//prints the time given

        for(String s : ZoneId.getAvailableZoneIds()){
           // System.out.println(s);
        }//prints all the zoneids
        t = LocalTime.now(ZoneId.of("UTC"));
        System.out.println("UTC time is ");
        System.out.println(t);//gives the time zone


        Instant i = Instant.now();
        System.out.println(i);


    }
}
