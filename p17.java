//WAP to take a sentence as input. In sentence replace with one  word with another word.

import java.util.*;

class p17 {
    public static void main(String [] args)
    {
        String sen,fw,rw;
        Scanner ip=new Scanner(System.in);
        System.out.printf("enter the sentence: ");
        sen=ip.nextLine();
        
        System.out.printf("enter the Find word: ");
        fw=ip.nextLine();
        
        System.out.printf("enter the replace word: ");
        rw=ip.nextLine();
        //mathod replace(oldchar,newchar); 
        System.out.printf("Modified sentence: "+sen.replace(fw,rw));
        
    }
}