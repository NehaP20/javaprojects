package AssignmentsMKT;
class Country_Class
{
	Country_Class(String a)
	{
	System.out.println("Test Country Class");
	}
}
class State_Class extends Country_Class
{
	State_Class(int a)
	{
		super("Neha");
		System.out.println("Test State Class");
	}
}
public class City_Class extends State_Class
{
	City_Class()
	{
	super(100); // super calling statements parameterized 
	System.out.println("Test City Class");
	}

public static void main(String[] args) 
{
	new City_Class();
	
}
}
