class Timedriver{
    public static void main(String[] args){
        Time obj = new Time();
        obj.setTime();
        System.out.println("Output of Universal time: ");
        obj.getUniversalTime();
        System.out.println("Output of Standard time: ");
        obj.getStandardTime();
    }
}