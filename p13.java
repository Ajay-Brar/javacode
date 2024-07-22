//WAP to store five name in array by user input and display names in alphabetical order
import java.util.*;
class p13{
    public static void main(String[] arg){
        int i;
    
        String [] name=new String[5];
        Scanner ip=new Scanner(System.in);
        for(i=0;i<5;i++){
            name[i]=ip.nextLine();}
            Arrays.sort(name);//for sorting the arrays
            System.out.println("Names in alphabetical order ");
            for(i=0;i<5;i++){
                System.out.println(name[i]);
            }


        }

    }
