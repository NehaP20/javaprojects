package JavaPractice;
public class Constructor_Overloading 
{
	Constructor_Overloading(int a)
	{
		System.out.println("1st Constructor");
	}
	Constructor_Overloading(int a, double b)
	{
		System.out.println("2nd Constructor");
	}
	Constructor_Overloading(int a, double b, char c)
	{
		System.out.println("3rd Constructor");
	}
	public static void main(String[] args) 
	{
		System.out.println("Learning constructor overloading");
		new Constructor_Overloading(98);
		new Constructor_Overloading(10,0.58645);
		new Constructor_Overloading(20,12.1955,'N');
	}

}
