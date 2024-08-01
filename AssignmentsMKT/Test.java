package AssignmentsMKT;

public class Test   
{
	int a=10;
	static int b=20; // GlobalVariable
	void man()
	{
		final double pi=3.14;
		System.out.println(pi);
	}
	public static void main(String[] args)
	{
		int z;
		System.out.println(b);
		Test g1=new Test();
		System.out.println(g1.a);
		g1.man();
	}
	
}