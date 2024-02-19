import java.util.*;
public class Hello
{
    public static void main(String[] agrs)
    {
        int     num         = 0,
                wrongCntr   = 0;

        String  color   = "";

        // scanner
        Scanner scan = new Scanner(System.in);
        
        //run
        System.out.println("Hello, this is a printed statement.");
        System.out.print("What is your favorite color: ");
        color = scan.next();
        System.out.print("Enter random number: ");
        num = scan.nextInt();

        // final response
        System.out.println("\nYour color was " + color + " and your number was " + num);

        System.out.print("Enter another random number: ");
        num = scan.nextInt();

        while(num <= 100)
        {

            System.out.println("\thaha");
            if (wrongCntr == 100)
            {
                num = 101;
                System.out.println("You Lose");
            }
            else
                wrongCntr += 1;

        }

    } 
} // end program