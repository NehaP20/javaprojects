package AssignmentsMKT;
import java.util.Arrays;
import java.util.Scanner;

public class Arrays_assignments39 
{
	public static void main(String[] args) 
	{
		int rollno[]=new int [3];
		Scanner s1=new Scanner(System.in);
		
		for(int i=0;i<3;i++)
		{
			rollno[i]=s1.nextInt();
		}
		System.out.println(Arrays.toString(rollno));
		
		double salary[]=new double[4];
		Scanner s2=new Scanner(System.in);
		
		for(int i=0;i<4;i++)
		{
			salary[i]=s2.nextDouble();
		}
		System.out.println(Arrays.toString(salary));
		
		boolean b1[]=new boolean[5];
		Scanner s3=new Scanner(System.in);
		
		for(int i=0;i<5;i++)
		{
			b1[i]=s3.nextBoolean();
		}
		
		System.out.println(Arrays.toString(b1));
	}
}
