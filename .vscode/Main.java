import java.util.Scanner;
 class Calc 
{
   public void add (int a,int b)
    {
        int sum = a + b ;
        System.out.println( "The Sum of "  + a + " and " + b + " is " + sum);
    }

    public void minus (int a, int b)
    {
        int subtract = a - b ;
        System.out.println( "The Substraction of "  + a + " and " + b + " is " + subtract);
    }

    public void mul (int a, int b)
    {
        int multiply = a * b ;
        System.out.println( "The Product of "  + a + " and " + b + " is " + multiply);
    }

    public void divide (int a, int b)
    {
        if (b == 0) 
        {
            System.out.println("Cannot divide by zero!");
        }
        else 
        {
            int divide = a / b;
            System.out.println("The Quotient of " + a + " divided by " + b + " is " + divide);
        }
    }
}
public class Main 
{
public static void main (String [] args)
 {     Calc s = new Calc();
        Scanner sc = new Scanner(System.in);
        String choice;
    do {   
        int firstnum,secondnum;
        System.out.println("Enter First Number to perform Operation:");
        firstnum= sc.nextInt();
        System.out.println("Enter Second Number to perform Operation:");
        secondnum= sc.nextInt();
        sc.nextLine();
        System.out.println("Please Enter the Operation You Want to Perform:\n" +
        "If you want to Add then please Enter A \n" +
        "If you want to Subtract then please Enter S \n" 
        + " If you want to Multiply then please Enter M \n" 
       +" If you want to Divide then please Enter D \n ");
        String op = sc.nextLine();
        char operation = op.toUpperCase().charAt(0);
        if (operation == 'A')
        {
            
            s.add(firstnum,secondnum);
        }
        else if (operation == 'S')
        {
           
            s.minus(firstnum,secondnum);
        }
        else if (operation == 'M')
        {
           
            s.mul(firstnum,secondnum);
        }
        else if (operation == 'D')
        {
            
            s.divide(firstnum,secondnum);
        }
        else 
        {
            System.out.println("Invalid Operation Selected");
        }
        System.out.println("Do you want to perform another operation? (yes/no):");
         choice = sc.nextLine().trim().toLowerCase();
    }while (choice.equals("yes") || choice.equals("y"));
    sc.close();    
    System.out.println("Thank you for using the calculator. Goodbye!");
}
}