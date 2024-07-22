//WAP to campare two input string for equality.
import java.util.*;
class p15
{
    public static void main(String [] args)
    {
        String str1,str2;
        Scanner ip=new Scanner(System.in);
        System.out.println("enter the first string: ");
        str1=ip.nextLine();
        
        System.out.println("enter the second string: ");
        str2=ip.nextLine();
        //For ignorig case sensitive word we use equalsIgnoreCase()
       //  if(str1.equalsIgnoreCase(str2)){
        if(str1.equals(str2)){
            
        System.out.println("Strings are equal");
        
        }
        else{
            
            System.out.println("string are not equal");
            }

    }
}