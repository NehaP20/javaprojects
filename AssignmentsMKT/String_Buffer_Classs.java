package AssignmentsMKT;

public class String_Buffer_Classs 
{
	public static void main(String[] args) 
	{
		StringBuffer s1= new StringBuffer("HarryPotter");
		s1.append(" - DanielRadcliffe");
		System.out.println(s1);
		System.out.println(s1.length());
		System.out.println(s1.substring(4));
		System.out.println(s1.substring(5, 23));
		System.out.println(s1.indexOf("H"));
		System.out.println(s1.isEmpty());
		System.out.println(s1.delete(5, 11));
		
		StringBuffer s2= new StringBuffer("Harmonie Granger");
		System.out.println(s2.replace(0, 17, "Emma Watson"));
		System.out.println(s2.insert(4, "a"));
	
		StringBuffer s3= new StringBuffer("Ron Weasley");
		System.out.println(s3.reverse());
		
		
	}

}
