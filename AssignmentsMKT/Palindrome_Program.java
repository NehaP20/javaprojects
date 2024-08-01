package AssignmentsMKT;

public class Palindrome_Program 
{
	public static void main(String[] args) 
	{
		String input="radar";
		String output="";
		for (int i=input.length()-1;i>=0;i--)
		{
			char c1=input.charAt(i);
			output=output+c1;
		}
		System.out.println(output);
		if (input.equals(output))
		{
			System.out.println("String is Palindrome");
		}
		else
		{
			System.out.println("String is not a Palindrome");
		}
	}

}
