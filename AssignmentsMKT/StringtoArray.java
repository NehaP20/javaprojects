package AssignmentsMKT;
import java.util.Arrays;
public class StringtoArray 
{
	public static void main(String[] args) 
	{
		String input="Food Court 360";
		int alpha=0;
		int numeric=0;
		
		char c1[]=input.toCharArray();
		System.out.println(Arrays.toString(c1));
		
		for (int i=0; i<input.length(); i++);
		{
			int i = 0;
			boolean b1=Character.isAlphabetic(c1[i]);
			if(b1==true)
			{
				alpha++;
			}
			
			boolean b2=Character.isDigit(c1[i]);
			if(b2==true)
			{
				numeric++;
			}
		}
		System.out.println(numeric);
		System.out.println(alpha);
		
			
	}

}

