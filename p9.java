// WAP to find factorial of given number
import java.util.*;
class p9
 {
    public static void main(String[] args)
    {
        Scanner ip=new Scanner(System.in);
        int n,factorial=1;
        System.out.println("Enter the number= ");
        n=ip.nextInt();

        if (n<=1)
        {
        System.out.println("factorial is 1");

        }
        while(n>=1)
        {
            factorial=factorial*n;
            n--;
            
        }
        System.out.println("the factorial is : "+factorial);
        


    }
 }