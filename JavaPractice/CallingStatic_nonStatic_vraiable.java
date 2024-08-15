package JavaPractice;

public class CallingStatic_nonStatic_vraiable 
{
	static int a=10;
	double d=0.012;
	
	void dumb()
	{
		System.out.println("Calling dumb as a non static method");
	}
	static void deaf()
	{
		System.out.println("Calling deaf as a Static method");
	}
	public static void main(String[] args) 
	{
		System.out.println("Learning about non static & static variable in a main method");
		deaf();
		CallingStatic_nonStatic_vraiable V1=new CallingStatic_nonStatic_vraiable (); // to invoke or call non static method we need to craete an object
		V1.dumb();
		System.out.println(a);
		System.out.println(V1.d); // with reference variable we can call non static variable in main method
	}
}
