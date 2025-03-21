import java.util.Scanner;

public class SearchInStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string to search in:");
        String str = scanner.nextLine();
        System.out.println("Enter the character to search for:");
        char ch = scanner.next().charAt(0);
        System.out.println(search(str,ch));
    }

    static boolean search(String str, char ch)
    {
        if(str.length()==0){
            return false;
        }
        for(char a : str.toCharArray())
        {
            if(a == ch)
                return true;
        }
        return false;
    }
}