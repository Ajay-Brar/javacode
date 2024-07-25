//WAP to demostrate concept of inheritence.
class Rundog
{
   public void Bark()
   {
    System.out.println("Sheru...");
    System.out.println("Bhau..Bhau..");
   }
}
class Bulldog extends Rundog //For inheritance we use EXTENDS key word.
{
    public void growl()
    {
        System.out.println("Tuffy...");
        System.out.println("Gurr..Gurr..");
 
    }
}
class InDemo1
{
    public static void main(String [] args)
    {
        Bulldog dog=new Bulldog(); //we created object of inherited class which canuse both class mathods.
        dog.Bark();//calling Rundog class mathod.
        dog.growl();//calling Bulldog class mathod.
    } 
}