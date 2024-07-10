package AssignmentsMKT;
public class Call_NonStaticMethod 
{
	
	void addition()
	{
		System.out.println("Addition of 2 numbers");
	}

	public static void main(String[] args) 
	
	{
		Call_NonStaticMethod c1=new Call_NonStaticMethod ();
		c1.addition();
		
	}
}

