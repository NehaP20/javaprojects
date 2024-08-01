package AssignmentsMKT;
public class Stringfunctions_sqlvsjava 
{
	public static void main(String[] args) 
	{
		String a1="manish kumar tiwari";
		System.out.println(a1.matches("(.*)i"));
		
		System.out.println(a1.matches("m(.*)"));
		
		System.out.println(a1.matches("(.*)k(.*)"));
		
		String a2="tom";
		System.out.println(a2.matches("..."));
		
	}

}
