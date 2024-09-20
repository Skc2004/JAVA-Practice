public class Addition 
{
    int num1=5;
    int num2=10;
    int sum=0;
    void getdata()
    {
        sum=num1+num2;
    }   
    void display()
    {
        System.out.println("The sum is: "+sum);
    }
    public static void main(String args[])
    {
        Addition addition = new Addition();
        addition.getdata();
        addition.display();
    }
}