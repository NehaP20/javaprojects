package AssignmentsMKT;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchException_Assign 
{
	public static void main(String[] args) 
	{
		 Scanner s1 = new Scanner(System.in);  
		 Scanner s2 = new Scanner(System.in);
		 try 
		 {
			 System.out.println("Enter value of a is -> ");
			 Integer a = s1.nextInt(); //we give any big value as input
			 System.out.println((a*a));
		 }
		 catch (InputMismatchException a)
		 {
			 System.out.println(a);
			 try
			 {
				 System.out.println("Enter value of a1 is -> ");
				 Integer a1= s2.nextInt(); //we give value 2 as input
				 System.out.println((a1));
			 }
			 catch (InputMismatchException a1)
			 {
				 System.out.println(a1);
			 }
		 }
	}

}
