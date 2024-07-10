package AssignmentsMKT;

class Daddy
{
	static void house()
	{
		System.out.println("Daddy have house");
	}
	static void car()
	{
		System.out.println("Daddy have car");
	}
	
}
public class SingleLevel_inheritance extends Daddy //Child Class
{
	static void laptop()
	{
		System.out.println("Child have laptop");
	}
	static void bike()
	{
		System.out.println("Child have bike");
	}
	public static void main(String[] args) 
	{
		laptop();
		bike();
		car();
		house();
	
		
	}

}
