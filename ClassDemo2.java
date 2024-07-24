/*WAP to create a class employee .In employee class create three variabe employee and salary.
In employee class create two mathod setValue() and display() .
setValue() mathod initialise variable and display() mathod print value of variable. */
class Employee{
    int empid;//instance variable
    String empname;//instance variable
    double salary;//instance variable
    public void setValue(int eid,String ename, double sal)//setValue method
    {
        empid=eid;
        empname=ename;
        salary=sal;        
    }    
    public void display()//display method
    {
        System.out.println("Employee Id= "+empid);
        System.out.println("Employee Name=  "+empname);
        System.out.println("Employee salary= "+salary);
    }
}
class ClassDemo2
{
    public static void main(String [] args)
    {
        Employee e1=new Employee();//creation of object
        e1.setValue(123,"Ajay",60000);
        e1.display();
        Employee e2=new Employee();//second object creation
        e2.setValue(121, "Aryan", 65000);
        e2.display();

    }
}