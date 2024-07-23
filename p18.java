//WAP to find sum of two number using user defined mathod.
import java.util.*;
class p18
{    //mathod are created in inside the class and outside of the main mathod.
    //syntax of mathod = modifier return type mathod name(parameters){code}.
   public static int sum(int a,int b)
   {
    return(a+b);
   }
    public static void main(String [] args)
    {
        Scanner ip=new Scanner(System.in);
        int a,b,c;
        System.out.println("enter two numbers: ");
        a=ip.nextInt();
        b=ip.nextInt();
        c=a+b;
        System.out.println("Sum= "+c);
        
    }
}