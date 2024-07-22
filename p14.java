//WAP to implement string mathods of lower case and upper case. 
import java.util.*;
class  p14
{
 public static void main(String [] args){
    String name;
    Scanner ip=new Scanner(System.in);
    System.out.println("enter the string name: ");
    name=ip.nextLine();
    System.out.println("Name in upper case: "+name.toUpperCase());
    System.out.println("Name in Lower case: "+name.toLowerCase());
    System.out.println("Name Lenth : "+name.length());

 }
}