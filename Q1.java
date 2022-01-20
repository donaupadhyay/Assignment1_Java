Name:-dona upadhyay
import java.util.Scanner;
public class Q1 
{
    public static void main(String[] args) 
    {
        int a;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number:");
        a = s.nextInt();
        if(a % 2 == 0)
        {
            System.out.println("The given number "+a+" is Even ");
        }
        else
        {
            System.out.println("The given number "+a+" is Odd ");
	}
    }
}