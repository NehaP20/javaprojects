package AssignmentsMKT;
public class StringFunctions_2remaining
{
	public static void main(String[] args) 
	{
		String a1="";
		System.out.println(a1.isEmpty());
		
		String name="Nagpur Maharashtra";
		System.out.println(name.lastIndexOf('a'));
		
		String name1= "Ajeet";
		System.out.println(name1.replace('e','i'));
		
		System.out.println(name.replaceAll(" ", ""));
		
		String b="school426";
		System.out.println(b.replaceAll("[0-9]",""));
		System.out.println(b.replaceAll("[a-z]",""));
		
		String c="Delhi Public School 123";
		System.out.println(c.replaceAll("[A-Z]",""));
		
		System.out.println();
	}

}
