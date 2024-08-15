package JavaPractice;
public class Overloading_Method 
{
	void College(int a)
	{
		System.out.println("Korean Series Name");
	}
	void College(double b , int a)
	{
		System.out.println("Descendants of the Sun");
	}
	static void College(char c, double b)
	{
		System.out.println("Pinocchio");
	}
	static void College(int a, double b, char c)
	{
		System.out.println("Welcome to waikiki");
	}
	public static void main(String[] args) 
	{
		System.out.println("Leaning Method Overloading Concept");
		Overloading_Method c1=new Overloading_Method();
		c1.College(16);
		c1.College(25.630, 10);
		College(20,12.356,'P');
		College('R',52.782);
	}

}
