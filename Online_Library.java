import java.util.Scanner;
public class Online_Library
{
    public String [] books ={" Kamlesh ki Kahani ","Rajesh ki Mehnat","The Biography of Hola","Life Story of Titu Mama","Sameer Fuddi ki rachnaaye","Gandhi ke karm","Rahul ki pappu banne ki kahani","Kya kejriwaal emaandaar h?","The Peaky Blinders","The Story"};
    public String check = " This Space is Empty ";
    public int flag0=0;
    public int flag=0;
    public int flag2=0;
    public int copy0;
    public int copy;
    public int copy2;
    void addBook()
    {
        Scanner sc=new Scanner(System.in);
            for(int i=0;i<10;i++)
            {
                if (books[i].equals(check))
                {
                    flag0=1;
                    copy0=i;
                }
            }
           if(flag0==1)
           {
               System.out.println("Enter the name of the book you wanna Add :- ");
               books [copy0]=sc.nextLine();
           }
           else
           {
               System.out.println("There is no Empty Space for new books!!!!!1");
           }
    }
    void issueBook()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of the book you wanna Borrow :- ");
        String x=sc.nextLine();
        for(int i=0;i<10;i++)
        {
            if (books[i].equals(x))
            {
                flag=1;
                copy=i;
            }
        }
            if(flag==1)
            {
                String b=books[copy];
                books[copy]=" This Space is Empty ";
                System.out.println("Your Request for the book "+b+" has been accepted and Issued to you.");
            }
            else
            {
                System.out.println("The book which you are looking for is not present in the library!!!!!!");
            }
    }
    void returnBook()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of the book you wanna Return :- ");
        String x=sc.nextLine();
        for(int i=0;i<10;i++)
        {
            if (books[i].equals(check))
            {
                flag2=1;
                copy2=i;
            }
        }
        if(flag==1)
        {
            x=books[copy2];
            System.out.println("Your Request for the return of the book "+x+" has been accepted.");
        }
        else
        {
            System.out.println("The book does not belong to the library!!!!!!");
        }
    }
    void showAvailableBooks()
    {
        System.out.println("The available books are as follows :- ");
        for(int i=0;i<10;i++)
        {
            if(books[i].equals(check))
            {
                System.out.println("This Book has been Borrowed!!");
            }
            else
            {
                System.out.println(books[i]);
            }
        }
    }
    void menu()
    {
        System.out.println("  WElCOME TO ONLINE LIBRARY SYSTEM  ");
        System.out.println("------------------------------------");
        System.out.println("Choose from the following actions :- ");
        System.out.println("1.Show the Available Books");
        System.out.println("2.Borrow a Book");
        System.out.println("3.Return a Book");
        System.out.println("4.Add a New Book (if space is available) ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        switch(n)
        {
            case 1:
            {
                showAvailableBooks();
                break;
            }
            case 2:
            {
                issueBook();
                break;
            }
            case 3:
            {
                returnBook();
                break;
            }
            case 4:
            {
                addBook();
                break;
            }
            default :
            {
                System.out.println("Wrong Choice !!!");
                break;
            }
        }
    }
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Online_Library s=new Online_Library();
        s.menu();
        System.out.println("Do you want further Services");
        System.out.println("1. Yes");
        System.out.println("2. No");
        int u=sc.nextInt();
        if(u==1)
        {
            s.menu();
        }
        else {
            System.out.println("Thank You for Visiting Our Online Library!!");
        }
    }
}
