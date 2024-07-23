//WAP to find a area of recrangle using user defined mathod.

import java.util.*;
class p19 
{
 public static int area(int l,int b)
 {
    return(l*b);
 }   
    public static void main(String [] args)
    {
        Scanner ip=new Scanner(System.in);
        int len,br,ar;
        System.out.printf("enter the length of the length: ");
        len=ip.nextInt();
        System.out.printf("enter the bridth of the length: ");
        br=ip.nextInt();
        ar=area(len,br);
        System.out.printf("Area of Rectangle= "+ar);


    }
}