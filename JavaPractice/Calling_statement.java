package JavaPractice;
public class Calling_statement //this calling statement 
{
	Calling_statement (int a)
	{
		System.out.println("Hello");
	}
	Calling_statement(int a, double b)
	{
		this(15);
		System.out.println("Hello Neha");
	}
	Calling_statement(int a, double b, char c)
	{
		this(10,16.1395);
		System.out.println("Hello Neha Patil");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Learning this calling statement in constructor overloading");
		new Calling_statement(20,12.1995,'P');
	}
}
