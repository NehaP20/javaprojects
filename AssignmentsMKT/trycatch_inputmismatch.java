package AssignmentsMKT;

public class trycatch_inputmismatch 
{
	public static void main(String[] args) 
	{
		String name[]=new String[2];
		name[0]="Neha";
		name[1]="Nitesh";
		
		try 
		{
			name[2]="Vanmala";
		}
		catch (ArrayIndexOutOfBoundsException a1)
		{
			
		}
		
	}
}
