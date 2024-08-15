package JavaPractice;

import java.util.Scanner;

public class Viva1_ 
{

	public static void main(String[] args) 
	{
		System.out.println("Give value to add");
		Scanner s1=new Scanner(System.in);
		int a=s1.nextInt();
		int b=s1.nextInt();
		int sum=a+b;
		
		System.out.println("Give values to sub");
		Scanner s2=new Scanner(System.in);
		int a1=s1.nextInt();
		int a2=s1.nextInt();
		int sub=a1-a2;
		
		switch(sum)
		{
		case 1:
			System.out.println("Addition of two numbers" + sum);
			break;
		}
		switch(sub)
		{
		case 1:
			System.out.println("Substraction of two numbers" + sub);
			break;
		}
	}
}
			
		
	

