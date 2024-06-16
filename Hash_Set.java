import java.util.HashSet;

public class Hash_Set
{
    public static void main(String[] args)
    {
        HashSet<Integer> hashSet = new HashSet();
        hashSet.add(1);
        hashSet.add(5);
        hashSet.add(6);
        hashSet.add(3);
        hashSet.add(1);
        hashSet.add(7);
        System.out.println(hashSet);
    }
}
