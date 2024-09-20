import java.util.Scanner;

public class onlineShoppingCart 
{
        private double cart[]=new double[100];

        public onlineShoppingCart()
        {
            for(int i=0;i<100;i++)
            {
                cart[i]=0.0;
            }
        }

        public void addProduct(double price,int itemNumber)
        {
            cart[itemNumber-1]=price;
        }

        public void deleteProduct(int itemNumber)
        {
            cart[itemNumber-1]=0.0;
        }

        public double totalPrice()
        {
            double sum=0.0;
            for(int i=0;i<100;i++)
            {
                sum=sum+cart[i];
            }
            return sum;
        }

        public void displayCart()
        {
            for(int i=0;i<100;i++)
            {
                if(cart[i]!=0.0)
                {
                    System.out.println("Item Number: "+(i+1)+" Price: "+cart[i]);
                }
            }
        }

        public double sum()
        {
            double sum=0.0;
            for(int i=0;i<100;i++)
            {
                sum=sum+cart[i];
            }
            return sum;
        }

        public static void main(String args[])
        {
            onlineShoppingCart cart=new onlineShoppingCart();
            Scanner sc = new Scanner(System.in);
            System.out.println("WELCOME TO THE ONLINE SHOPPING CART");
            System.out.println("-----------------------------------");
            System.out.println();
            System.out.println("Menu:- ");
            System.out.println("1. Add Product");
            System.out.println("2. Delete Product");
            System.out.print("Enter your Choice(1-2): ");
            int choice =sc.nextInt();
            switch(choice)
            {
                case 1:
                {
                    System.out.print("Enter the number of products to be added: ");
                    int n=sc.nextInt();

                    for(int i=0;i<n;i++)
                    {
                        System.out.print("Enter the Item Number: ");
                        int itemNumber=sc.nextInt();
                        System.out.print("Enter the price of the product: ");
                        double price=sc.nextDouble();
                        cart.addProduct(price, itemNumber);
                    }

                    System.out.println("The total amount is: "+cart.sum());
                    break;
                }

                case 2:
                {
                    System.out.print("Enter the Item Number: ");
                    int itemNumber=sc.nextInt();
                    cart.deleteProduct(itemNumber);

                    System.out.println("The total amount is: "+cart.sum());
                    break;
                }
                
                default:
                {
                    System.out.println("Invalid Choice");
                    break;
                }
            }
            sc.close();
        }
}
