package JavaPractice;
class Multi
{
	void Showroom()
	{
		System.out.println("Giving the properties to super class");
	}
}
class Multi1 extends Multi
{
	void Cars()
	{
		System.out.println("Inheriting the properties from the most-super class");
	}
}
public class Inheritance1 extends Multi1
{
	void Hyundai() 
	{
		System.out.println("Inheriting the properties from super class");
	}
	public static void main(String[] args) 
	{
		System.out.println("Checking the Multi Level Inheritance");
		Inheritance1 t1= new Inheritance1();
		t1.Showroom();
		t1.Cars();
		t1.Hyundai();
		
	}

}
