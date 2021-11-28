import java.util.Scanner;
import java.time.LocalTime;
public class Time{
    int sec, min, hr;
    Scanner scan = new Scanner(System.in);
    void getUniversalTime(){
        LocalTime lt = LocalTime.of(this.hr, this.min, this.sec);
        System.out.println(lt);
    }
    void getStandardTime(){
        int hour=this.hr, flag=0;
        if(hour>12){
            hour-=12;
            flag=1;
        }
        LocalTime lt = LocalTime.of(hour, this.min, this.sec);
        if(flag==0){
            if(hour==12)    System.out.println(lt+" PM");
            else    System.out.println(lt+" AM");
        }
        else{
            if(hour==12)    System.out.println(lt+" AM");
            else    System.out.println(lt+" PM");
        }

    }
    void setTime(){
        System.out.println("Enter time in Universal Format (hh:mm:ss): ");
        String time=scan.next();
        LocalTime lt = LocalTime.parse(time);
        this.sec=lt.getSecond();
        this.min=lt.getMinute();
        this.hr=lt.getHour();
    }

}
