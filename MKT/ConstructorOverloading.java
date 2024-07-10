package MKT;
public class ConstructorOverloading 

{
	ConstructorOverloading() 
	{
		System.out.println("Login to Amazon");
	}
	
	ConstructorOverloading(int a) 
	{
		System.out.println("Logout to Amazon");
	}
	ConstructorOverloading(String name) 
	{
		System.out.println("from amazon");
	}
	ConstructorOverloading(double b) 
	{
		System.out.println("True");
	}
	public static void main(String[] args) 
	
	{
		new ConstructorOverloading();
		new ConstructorOverloading (1132523);
		new ConstructorOverloading("Neha");
		new ConstructorOverloading(9.00006);
		
		
	}

}
