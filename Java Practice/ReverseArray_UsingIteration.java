package JavaPractice;
import java.util.Arrays;
public class ReverseArray_UsingIteration 
{
	public static void main(String[] args) 
	{
		int a [] = new int [3];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		int output1 =0;
		
		int b [] = new int [3];
		for(int i =0 ; i<3 ; i++)
		{
			b[i] = a[i];
		}
		System.out.println("B array is - "+ Arrays.toString(b));
		
		for(int j=2; j>=0 ; j--)
		{
			output1 = b[j];
			
			System.out.print(output1);
			if(j==0)
			{
			System.out.print("");
			}
			else
			{
				System.out.print(",");
			}
		}
		
	}

}
