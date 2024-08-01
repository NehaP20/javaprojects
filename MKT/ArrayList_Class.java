package MKT;
import java.util.ArrayList;
public class ArrayList_Class 
{
	public static void main(String[] args) 
	{
		ArrayList a1=new ArrayList();
		a1.add("Neha");
		a1.add("Nitesh");
		a1.add("Anshu");
		System.out.println("a1. is ->" + a1);
		
		ArrayList a2=new ArrayList();
		a2.addAll(a1);
		a2.add("Pooja");
		a2.add("Priya");
		System.out.println("a2 is ->" +a2);
		
		a1.add(1,"Pranshu");
		System.out.println("a1.. is ->" + a1);
		
		a1.addAll(2,a2);
		System.out.println("a1... is ->" + a1);
		
		a2.remove("Pooja");
		System.out.println("a2.. is ->" + a2);
		System.out.println(a2.contains("Neha"));
		
		a2.removeAll(a1);
		System.out.println("a2... is ->" + a2);
		
		System.out.println(a2.size());
		System.out.println(a1.size());
		System.out.println(a1.isEmpty());
		
	}

}
