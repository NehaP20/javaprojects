package MKT;
public class Parameterized_nonstatic 
{
	void add(int a,int b)
	{
		int sum=a+b;
		System.out.println(sum);
	}
	
	void add(double a,int b)
	{
		double sum=a+b;
		System.out.println(sum);
	}
	
	public static void main(String[] args) 
	{
		Parameterized_nonstatic p1=new Parameterized_nonstatic();
		p1.add(210, 110);
		p1.add(12.0235, 210);
	
		
	}

}
	
	

