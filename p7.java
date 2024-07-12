//Temprature converter program

import java.util.*;
class p7 
{
public static void main(String[] args)
{
    Scanner ip=new Scanner(System.in);
    int ch;
    int f,c;
    System.out.printf("Enter the value of f: ");
    f=ip.nextInt();
    System.out.printf("Enter the value of c: ");
    c=ip.nextInt();
    System.out.println("1.centigrade to fahrenheit ");
    System.out.println("2.fahrenheit to centigrade ");
    System.out.println("Enter you choise: ");
    ch=ip.nextInt();
    

        switch(ch)
    {
        case 1:
        System.out.println("centigrade to fahrenheit");
        f=(9*c)/5+32;
        System.out.println("fahrenhait= "+f);
        break;
        case 2:
        System.out.println("fahrenheit to centigrade");
        c=(f-32)*5/9;
        System.out.println("centigrade= "+c);
        default:
        System.out.println("Error");
        


    }
    
}
}