//CHARACTER FREQUENCY/ COUNT OF A LETTER IN A GIVEN WORD
import java.util.Scanner;
public class CharFreq{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the word:");
        String word=sc.nextLine();
        System.out.println("Enter the letter whose frequency is to be found:");
        char c=sc.next().charAt(0); //there is no implicit fN for dynamic input of single character
        int len=word.length(), count=0;
        for(int i=0;i<len;i++){
            if(word.charAt(i)==c)
                count++;
        }
        System.out.println("The count of letter "+c+" is "+count);
    }
}