// WAP to take number as input and display day name 
import java.util.*;
class p6
{
    public static void main(String[] args)
    {
        int dno;
        Scanner ip = new Scanner(System.in);
        dno=ip.nextInt();
       System.out.println("enter the day you want to see: ");
        switch(dno)
        {
            case 1:
            System.out.println("Monday");
            break;
            case 2:
            System.out.println("Tuesday");
            break;
            case 3:
            System.out.println("Wednesdat");
            break;
            case 4:
            System.out.println("Thursday");
            break; 
            case 5:
            System.out.println("Friday");
            break;
            case 6:
            System.out.println("Saturday");
            break;
            case 7:
            System.out.println("Sunday");
            break;
            default:
            System.out.println("No is not correct");
            break;
        }
    }
}