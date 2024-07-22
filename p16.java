import java.util.*;
class p16 
{
    public static void main(String [] args)
    {
        Scanner ip=new Scanner(System.in);
        String sen;
        System.out.println("enter the sentece: ");
        sen=ip.nextLine();
        String [] words=sen.split(" ");
        System.out.println("number of words : "+words.length);
    }
}