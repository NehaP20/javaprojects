package MKT;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList_UsingIterator 
{
	public static void main(String[] args)
	{
		ArrayList a1=new ArrayList();
		a1.add("Neha");
		a1.add("Nitesh");
		a1.add("Patils");
		a1.add(17);
		a1.add('N');
		System.out.println("a1 is ->" + a1);
		
		ListIterator i2= a1.listIterator();
		while(i2.hasNext()) 
		{
			System.out.println(i2.next());
		}
		
		while (i2.hasPrevious())
		{
			System.out.println(i2.previous());
		}
		
	/*	Iterator i1= a1.iterator();
		while (i1.hasNext())
		{
			System.out.println(i1.next());
		}
		*/
		
	}

}
