import java.util.ArrayList;

public class ArrayList_using_for_each_loop
{
    public static void main(String[] args)
    {
        ArrayList<String> arr= new ArrayList<>();
        arr.add("Student 1");
        arr.add("Student 2");
        arr.add("Student 3");
        arr.add("Student 4");
        arr.add("Student 5");
        arr.add("Student 6");
        arr.add("Student 7");
        arr.add("Student 8");
        arr.add("Student 9");
        arr.add("Student 10");
        for(String i:arr)
        {
            System.out.println(i);
        }
    }
}
