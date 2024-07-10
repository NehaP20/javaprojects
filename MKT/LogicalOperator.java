package MKT;
public class LogicalOperator 
{
	public static void main(String[] args) 
	{
		int age=19;
		char gender='M';
		
		if (age>=18 && gender=='M')
		{
			System.out.println("Fulll ticket");
		}
		
		if (age>=18 || gender=='F')
		{
			System.out.println("statement 2");
		}
		
		if (!(age>=18 || gender=='F'))
		{
			System.out.println("statement 3");
		}
		
		if (!(age>=18 && gender=='M'))
		{
			System.out.println("statement 4");
		}
		
	}

}
