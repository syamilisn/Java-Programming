import java.util.Scanner;
public class NestedLoops{
    void pattern1(){
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++)
                System.out.print("*");
            System.out.println();
        }
    }
    void pattern2(){
        for(int i=0;i<5;i++){
            for(int j=0;j<=i;j++)
                System.out.print("*");
            System.out.println();
        }
    }
    void pattern3(){
        for(int i=0;i<5;i++){
            for(int j=5;j>i;j--)
                System.out.print("*");
            System.out.println();
        }
    }

    void pattern4(){
        for(int i=0;i<5;i++){
            for(int j=0;j<10;j++)
                if(j%2==0)
                    System.out.print("<");
                else
                    System.out.print(">");
            System.out.println();
        }
    }
    public static void main(String args[]){
        NestedLoops obj= new NestedLoops();
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your choice of pattern:");
        int choice = sc.nextInt();
        switch(choice){
            case 1: obj.pattern1(); break;
            case 2: obj.pattern2(); break;
            case 3: obj.pattern3(); break;
            case 4: obj.pattern4(); break;
            default: System.out.println("Invalid Choice"); break;

        }
        
    }
}