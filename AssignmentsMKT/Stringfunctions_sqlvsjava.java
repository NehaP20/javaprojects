package AssignmentsMKT;
public class Stringfunctions_sqlvsjava 
{
	public static void main(String[] args) 
	{
		String a1="manish kumar tiwari";
		System.out.println(a1.matches("(.*)i")); // check ends with i
		
		System.out.println(a1.matches("m(.*)")); // check start with m
		
		System.out.println(a1.matches("(.*)k(.*)")); // check letter k is present or not
		
		String a2="tom";
		System.out.println(a2.matches("...")); // check the letter is 3 or not
		
	}

}
