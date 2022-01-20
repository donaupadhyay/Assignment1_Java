// Name:- Dona Upadhyay
import java.util.Scanner;
public class Q3 {
     public static void main(String args[]){
      int a,b;
      int check, rem, sum = 0;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the first number:");
      a=sc.nextInt();
      System.out.println("Enter the second number:");
      b=sc.nextInt();
      for (int i=a;i<b;i++)
      {
         check=i;
         while(check!=0) {
            rem=check%10;
            sum=sum+(rem*rem*rem);
            check=check/10;
         }
         if(sum==i){
            System.out.println(""+i+" is an Armstrong number");
         }
      }
   }
}