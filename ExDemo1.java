//WAP to find division of two number.(using exception handling)
import java.util.*;
class ExDemo1{
    public static void main(String [] args){
        int x,y,div;
        Scanner ip=new Scanner(System.in);
      try{  // code you want to protect from exception.
        System.out.print("Enter first number: ");
        x=ip.nextInt();
        System.out.print("Enter second number: ");
        y=ip.nextInt();
        div=x/y;
        System.out.print("Result: "+div);
      }
      catch(InputMismatchException e1 ){//exception handle. 
        System.out.println("entered value  is not numerical.");
      }catch(ArithmeticException e2){ //exception handle.
        System.out.println("Are you tryig to / by zero");

      }
      finally {
        System.out.printf(" This is finally block.");
    } 

    }
    
}