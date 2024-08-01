package AssignmentsMKT;
import java.util.Arrays;
public class StringtoArray_Alphabets 
{
	public static void main(String[] args) 
	{
		String input = "Neha 201295 Patil @#&*%";
		int aplha_count=0;
		int numeric_count=0;
		int whitespace_count=0;
		
		char c[]=input.toCharArray();
		System.out.println(Arrays.toString(c));
		
		for(int i=0; i<input.length(); i++)
		{
			boolean b=Character.isAlphabetic(c[i]);
			if (b==true)
			{
				aplha_count++;
			}
			
			boolean b1=Character.isDigit(c[i]);
			if (b1==true)
			{
				numeric_count++;
			}
			
			boolean b2=Character.isWhitespace(c[i]);
			if (b2==true)
			{
				whitespace_count++;
			}
		}
		System.out.println("Aplhabets Count is -> " + aplha_count);
		System.out.println("Numeric Values Count is -> " + numeric_count);
		System.out.println("Whitespace Count is -> " + whitespace_count);
		
		int specialcharacter_count=input.length()-(aplha_count+numeric_count+ whitespace_count);
		System.out.println("Special Characters Count is -> " + specialcharacter_count);
	}

}
