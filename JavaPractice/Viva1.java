package JavaPractice;

import java.util.Arrays;

public class Viva1 {

	public static void main(String[] args) 
	{
		String name1 = "race";
		String name2 = "care";
		
		char c1[]=name1.toCharArray();
		char c2[]=name2.toCharArray();
		
		Arrays.sort(c2);
		Arrays.sort(c1);
		
		System.out.println(Arrays.toString(c2));
		System.out.println(Arrays.toString(c1));
		
		}

	}

