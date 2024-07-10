package AssignmentsMKT;
public class String_Method
{
	public static void main(String[] args) 
	{
		String name="NEHA";
		System.out.println(name.length());
		
		String name1="neha patil";
		System.out.println(name1.toUpperCase());
		System.out.println(name.toLowerCase());
		
		String name2="school name is vidya";
		System.out.println(name2.charAt(13));
		System.out.println(name2.indexOf("e"));
		
		String a="       automation batch    ";
		System.out.println(a.trim());
		
		String name3="school name is dinanath ";
		System.out.println(name3.substring(3));
		System.out.println(name3.substring(0, 6));
		System.out.println(name3.substring(7, 11));
		System.out.println(name3.substring(12, 14));
		System.out.println(name3.substring(15, 23));
	}
	

}
