// Name:- Dona Upadhyay
import java.util.Scanner;
public class Q5 {
     public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println("Given number is: "+ number);
        int a=0;
        int b=0;
        b=number % 10;
        System.out.println("Last Digit is: " +b);        
        while(number != 0)
        {
            a=number%10;
            number=number/10;
        }
        System.out.println("First Digit is: " +a);
    }
}