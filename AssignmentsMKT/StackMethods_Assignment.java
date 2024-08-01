package AssignmentsMKT;

import java.util.Stack;

public class StackMethods_Assignment 
{
	public static void main(String[] args) 
	{
		Stack<String> s1= new Stack<String>();
		//push
		s1.add("Neha");
		s1.add("Patil");
		s1.add("11");
		s1.add("12");
		s1.add("13");
		s1.add("14");
		
		System.out.println("Stack: " + s1);
		//peek
		System.out.println("Peek: " + s1.peek());
		System.out.println("Stack: " + s1);
		
		//pop
		System.out.println("Pop: " + s1.pop());
		System.out.println("Stack: " + s1);
		
	}

}
