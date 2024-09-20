import java.util.Random;

public class grades 
{
    private int grade[]=new int[30];
    
    public grades()
    {
        Random rn = new Random();
        for(int i=0;i<30;i++)
        {
            grade[i]=rn.nextInt(100);
        }
    }

    public double average()
    {
        double sum =0.0;
        for(int i=0;i<30;i++)
        {
            sum=sum+grade[i];
        }
        double avg = sum/30;
        return avg;
    }

    public int maxGrade()
    {
        int max=grade[0];
        for(int i=0;i<30;i++)
        {
            if(grade[i]>max)
            {
                max=grade[i];
            }
        }
        return max;
    }

    public int minGrade()
    {
        int min=grade[0];
        for(int i=0;i<30;i++)
        {
            if(grade[i]<min)
            {
                min=grade[i];
            }
        }
        return min;
    }

    public void sortDescending()
    {
        for(int i=0;i<30;i++)
        {
            for(int j=i+1;j<30;j++)
            {
                if(grade[i]<grade[j])
                {
                    int temp = grade[i];
                    grade[i]=grade[j];
                    grade[j]=temp;
                }
            }
        }
    }

    public void display()
    {
        for(int i=0;i<30;i++)
        {
            System.out.println(grade[i]);
        }
    }

    public static void main( String args[])
    {
        grades obj=new grades();
        System.out.println("The Grades are:- ");
        obj.display();
        System.out.println("The Average Grade is: "+obj.average());
        System.out.println("The Maximum Grade is: "+obj.maxGrade());
        System.out.println("The Minimum Grade is: "+obj.minGrade());
        obj.sortDescending();
        System.out.println("The Grades after sorting in descending order are: ");
        obj.display();
    }
}