//WAP to print a table of given number

import java.util.*;
class p10
{
    public static void main(String[] args)
    {
        Scanner ip=new Scanner(System.in);
        int n;
        System.out.printf("enter the value of n: ");
        n=ip.nextInt();
        for(int i=1;i<11;i++)
        {
            System.out.println(n+"*"+i+"="+i*n);
            
        }


    }
}