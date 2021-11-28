class ForEach{
    public static void main(String arr[]){
        int list[] = { 1, 2, 3, 4, 5 };
        int sum = 0;
        for(int item : list){
            System.out.println("Value is: " + item);
            sum += item;
        }
        System.out.println("Sum is:  " + sum);
    }
}
