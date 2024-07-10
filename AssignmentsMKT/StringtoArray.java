package AssignmentsMKT;
import java.util.Arrays;
public class StringtoArray 
{
	public static void main(String[] args) 
	{
		int count_of_alpha=0;
		int count_of_numeric=0;
		String input="Food Court 360 ";
		char c1[]= input.toCharArray();
		System.out.println(Arrays.toString(c1));
		
		for (int i=0; i<input.length();i++);
		{
			boolean b1=Character.isAlphabetic(c1[count_of_alpha]);
			boolean b2=Character.isDigit(c1[count_of_numeric]);
			if(b1==true)
			{
				count_of_alpha++;
			}
			if(b2==true)
			{
				count_of_numeric++;
			}
		}
		System.out.println(count_of_numeric);
		System.out.println(count_of_alpha);
		
			
	}

}
