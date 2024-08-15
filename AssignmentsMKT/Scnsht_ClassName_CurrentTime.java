package AssignmentsMKT;

import java.util.Date;

public class Scnsht_ClassName_CurrentTime 
{
	public static void main(String[] args) 
	{
		Scnsht_ClassName_CurrentTime s1=new Scnsht_ClassName_CurrentTime();
		System.out.println(s1.getClass());
		
		Date d1=new Date();
		d1.getTime();
		
		Date d2=new Date(d1.getTime());
		System.out.println(d2);
		
	}

}
