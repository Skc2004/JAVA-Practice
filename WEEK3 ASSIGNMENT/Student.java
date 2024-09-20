import java.util.Scanner;

public class Student 
{
    public String name;
    public int rollNumber;
    public int marks;
    
    public Student (String name, int rollNumber, int marks)
    {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public char calculateGrade()
    {
        if(marks>90)
        {
            return 'A';
        }
        else if(marks>80)
        {
            return 'B';
        }
        else if(marks>70)
        {
            return 'C';
        }
        else if(marks>60)
        {
            return 'D';
        }
        else if(marks>50)
        {
            return 'E';
        }
        else
        {
            return 'F';
        }
    }

    public void display(char Grade)
    {
        System.out.println("Name: "+name);
        System.out.println("Roll Number: "+rollNumber);
        System.out.println("Marks: "+marks);
        System.out.println("Grade: "+Grade);
    }

    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the name of the student: ");
        String name= sc.nextLine();
        System.out.print("Enter the Roll Number: ");
        int rollNumber = sc.nextInt();
        System.out.print("Enter the Marks: ");
        int marks = sc.nextInt();
        Student s = new Student(name,rollNumber,marks);
        char grade = s.calculateGrade();
        s.display(grade);
        sc.close();
    }
}
