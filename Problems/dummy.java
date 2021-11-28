import java.time.LocalTime;
class dummy{
    public static void main(String[] args){
        System.out.println("halo");
        int hour=02, minute=2, second=12;
        LocalTime lt = LocalTime.of(hour, minute, second);
        System.out.println(lt.getHour()+":"+lt.getMinute()+":"+lt.getSecond());
    }
}