package Inheritance.Program; // Hierarchical inheritance 
public class Child_class1 extends CommonClass
{
	void play()
	{
		System.out.println("Non static method");
	}
	public static void main(String[] args) 
	{
		System.out.println("Checking for Hierarchical Inheritance");
		Child_class1 h1= new Child_class1();
		h1.play();
		h1.school();
		Child_class2 h2=new Child_class2();
		h2.classroom();
		h2.school();
		
	}

}
