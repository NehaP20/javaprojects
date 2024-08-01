package JavaPractice;

import java.util.Arrays;

public class Anagram_Project 
{
	public static void main(String[] args) 
	{
		String s1="race";
		String s2="care";
		
		char []c1=s1.toCharArray();
		char []c2=s2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		System.out.println("After sorting" + Arrays.toString(c1));
		System.out.println("After sorting" + Arrays.toString(c2));
	}

}
