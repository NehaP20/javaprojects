package AssignmentsMKT;
class Amazon
{
	static void Electronics()
	{
		System.out.println("Online shopping for all electronics products");
	}
}

class Flipkart extends Amazon
{
	static void Clothes()
	{
		System.out.println("Online shopping for all types of clothes");
	}
}

public class Multi_levelinheritance extends Flipkart
{
	static void ChildProperty()
	{
		System.out.println("Online shopping from Amazon & Flipkart");
	}
	
public static void main(String[] args) 
	{
		Electronics();
		Clothes();
		ChildProperty();
		
	}

}
