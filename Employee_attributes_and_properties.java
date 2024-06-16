import java.util.Scanner;
class Employee
{
    int Salary;
    String name;
    String changed;
    String getname()
    {
        return name;
    }
    void setname()
    {
        name=changed;
    }
    int getsalary()
    {
        return Salary;
    }
}
public class Employee_attributes_and_properties
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Employee obj=new Employee();
        System.out.println("Enter your name :- ");
        obj.name=sc.nextLine();
        System.out.println("Enter your salary  :- ");
        obj.Salary=sc.nextInt();
        System.out.println();
        System.out.println();
        System.out.println("Name : "+obj.getname());
        System.out.println("Salary : "+obj.getsalary());
        System.out.println("Enter the changed name :- ");
        obj.changed=sc.nextLine();
        obj.setname();
        System.out.println("Changed Name : "+obj.getname());
        System.out.println("Salary : "+obj.getsalary());
    }
}
