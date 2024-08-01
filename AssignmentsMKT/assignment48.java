package AssignmentsMKT;
import java.util.Scanner;
public class assignment48 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
   
        try {
            int number = scanner.nextInt();
            System.out.println("You entered: " + number);

            try {
                if (number > 0) 
                {
                    System.out.println("The number is positive.");
                } 
                else if (number < 0) 
                {
                    System.out.println("The number is negative.");
                } 
                else 
                {
                    System.out.println("The number is zero.");
                }
            } 
            catch (Exception a) 
            {
                System.out.println("An error occurred while processing the number.");
            }
        } 
        catch (Exception a) 
        {
            System.out.println("Invalid input! Please enter an integer.");
        } 
        
    }
}
