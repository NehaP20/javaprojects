package JavaPractice;
import java.util.Scanner;
public class Scanner_Practice 
{
	public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);
 
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        System.out.print("Enter your height in meters (e.g., 1.75): ");
        double height = scanner.nextDouble();
        
        // Output the information
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
    }
}

