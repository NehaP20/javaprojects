package MKT;
public class MethodOverloading 
{
	static void add()
	{
		System.out.println("1");
	}
	static void add(int a)
	{
		System.out.println("2");
	}
	static void add(int a,double b)
	{
		System.out.println("3");
	}
	static void add(double a,int b)
	{
		System.out.println("4");
	}
	static void add(char a)
	{
		System.out.println("5");
	}
	static void add(boolean a)
	{
		System.out.println("6");
	}
	 void add(double a,int b,int c)
	{
		System.out.println("7");
	}
	 void add(char a,char b)
	{
		System.out.println("8");
	}
	 void add(boolean a, char b)
	{
		System.out.println("9");
	}
	 void add(boolean a, boolean b)
		{
			System.out.println("10");
		}
	public static void main(String[] args) 
	
	{
		add('A');
		add(true);
		add(20.1522,121);
		MethodOverloading m1=new MethodOverloading();
		m1.add(false, false);
		
		
		
		
	}
}
