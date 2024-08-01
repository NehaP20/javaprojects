package AssignmentsMKT;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayList_toList 
{
	public static void main(String[] args) 
	{
		System.out.println("Understanding List");
		List l1=new ArrayList();
		//Upcasting
		l1.add(12.3565);
		l1.add("Neha");
		l1.add("Mumbai");
		l1.add('N');
		l1.add(30);
		System.out.println(l1);
		
		
		System.out.println("Understanding Set");
		Set s1 = new HashSet();
		s1.add(12.3565);
		s1.add("Neha");
		s1.add("Mumbai");
		s1.add('N');
		s1.add(30);
		System.out.println(s1);
		
	}

}
