package AssignmentsMKT;
import java.util.Arrays;
public class Arrays_Program 
{
	public static void main(String[] args) 
	{
		String [] name=new String[3];
		name[0]="Hrithik";
		name[1]="Shahrukh";
		name[2]="Salman";
		
		for(int i=0;i<=2;i++)
		{
			System.out.println(name[i]);
		}
		 
		System.out.println(Arrays.toString(name));
		
		int rollno[]=new int[3];
		rollno[0]=90;
		rollno[1]=80;
		rollno[2]=70;
		
		System.out.println(Arrays.toString(rollno));
		
		char c1[]=new char[4];
		c1[0]='n';
		c1[1]='e';
		c1[2]='h';
		c1[3]='a';
		
		System.out.println(Arrays.toString(c1));
		
		boolean b1[]=new boolean[3];
		b1[0]=true;
		b1[1]=false;
		b1[2]=true;
		
		System.out.println(Arrays.toString(b1));
	}
	
}
