package JavaPractice;

import java.util.Arrays;

public class ClassTest
{

	public static void main(String[] args) 
	{
		String s = "world is full of beautiful people";
		int count=0;
		
		char c [] = s.toCharArray();
		
		System.out.println(Arrays.toString(c));
		
		for(int i =0 ; i< s.length() ; i++)
		{
		boolean b= Character.isAlphabetic(c[i]);
		//System.out.println(b);
			if(b==true)
			{
				count++;
			}
		}
		System.out.println(count);
		Arrays.sort(c);
		
	}

}
