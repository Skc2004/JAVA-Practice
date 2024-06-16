import java.util.Scanner;
public class float_array_sum
{
    public static void main(String[] args)
    {
        float [] arr={0.5f,0.6f,0.7f,0.8f};
        int length=arr.length;
        float sum=0.0f;
        for(int i=0;i<length;i++)
        {
            sum=sum+arr[i];
        }
        System.out.println("The sum is : "+sum);
    }
}
