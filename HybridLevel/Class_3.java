package HybridLevel;
public class Class_3 extends Class_2
{
	void cats()
	{
		System.out.println("Now the second one will calls Cats");
	}
	public static void main(String[] args) 
	{
		System.out.println("Checking Hybrid Level in Java");
		Class_3 k1=new Class_3();
		k1.mad(); // from class 1
		k1.Dog(); //from class 2
		k1.cats(); // from class 3
		
		Class_4 k2=new Class_4();
		k2.Rabbit(); // from class 4	
	}
}
