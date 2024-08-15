package JavaPractice;

public class Constructor_invoke 
{
	Constructor_invoke()
	{
		System.out.println("My first constructor calling just by creating an object");
	}
	public static void main(String[] args) 
	{
		System.out.println("How to call constructor");
		new Constructor_invoke(); // another type of create an object
	}

}
