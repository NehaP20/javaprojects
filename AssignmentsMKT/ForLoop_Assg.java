package AssignmentsMKT;

public class ForLoop_Assg 
{
	final static double pi=Math.PI;
	
	public static void main(String[] args)
	{
		for (int i=0;i<10;i++)
		{
			double r=Math.random();
			double area= pi*r*r;
			System.out.println(area);
		}
		
	}
}
