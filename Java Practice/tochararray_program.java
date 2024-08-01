package JavaPractice;
import java.util.Arrays;
public class tochararray_program 
{
	public static void main(String[] args)
	{
		String name ="Abhishek";
		char[]a1=name.toCharArray();
		System.out.println(Arrays.toString(a1));
		
		String name1[]=new String[3];// checking two arrays equals
		name1[0]="Ram";
		name1[1]="Sita";
		name1[2]="Laksham";
		
		String name2[]=new String[3];
		name2[0]="Ram";
		name2[1]="Sita";
		name2[2]="Laksham";
		
		System.out.println(Arrays.equals(name1, name2));
	}

}
