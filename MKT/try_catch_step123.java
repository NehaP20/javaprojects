package MKT;

import java.util.InputMismatchException;

public class try_catch_step123 
{
	public static void main(String[] args) 
	{
		/* int c=a/b; */ // a- comes from parent class
						// b- comes from child class
		
		try
		{
			int c=1/0; // c=1/1 (step 4(a),5)
			System.out.println(c);
		}
		catch (ArithmeticException a)
		{
			System.out.println("I have handled the Exception 1");
		}
		catch (InputMismatchException a)
		{
			System.out.println("I have handled the Exception 2");
		}
	}

	
}
