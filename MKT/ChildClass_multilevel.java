package MKT;

class GrandParent
{
	static void Land()
	{
		System.out.println("Dadu have land");
	}
	static void house()
	{
		System.out.println("Dadu have house");
	}
}
	
class Parent extends GrandParent
	{
		static void Farmhouse()
		{
			System.out.println("Parent have Farmhouse");
		}
		static void car()
		{
			System.out.println("Parent have Car");
		}
	}

public class ChildClass_multilevel extends Parent
{
	static void bike()
	{
		System.out.println("Child have bike");
	}
	static void iphone()
	{
		System.out.println("Child have iphone");
	}
	public static void main(String[] args) 
	{
		bike();
		iphone();
		house();
		Land();
		car();
		Farmhouse();
		
		
		
		
	}
}

