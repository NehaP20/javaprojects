package MKT;

import java.util.ArrayList;

public class ArrayListProgram 
{
	public static void main(String[] args)
	{
		ArrayList a1=new ArrayList();
		a1.add("Neha");
		a1.add("Nitesh");
		a1.add("Anshu");
		a1.add("Pooja");
		a1.add("Priya");
		a1.add(17);
		a1.add(89.30);
		a1.add('N');
		a1.add(true);
		//collections.sort(a1);
		a1.add(null);
		a1.add(null);
		
		System.out.println(a1);
	}

}
