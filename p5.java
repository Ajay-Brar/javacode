//WAP to find the greatest number in three unequal number
 
import java.util.*;
class p5
{
    public static void main(String[] args)
    {
        
int a,b,c;
Scanner ip=new Scanner(System.in);
System.out.print("Enter first no.= ");
a=ip.nextInt();
System.out.print("Enter the second no.= ");
b=ip.nextInt();
System.out.print("enter third no. = ");
c=ip.nextInt();

if(a>b && a>c)
{
    System.out.println("Greatest no. is = "+a);

}
else if (b>a && b>c)
{
    System.out.println("Greatest no. is = " +b);
    
}
else
{
System.out.println("The Greatest no. is + "+c);
}

    }
}
