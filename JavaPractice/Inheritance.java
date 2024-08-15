package JavaPractice; // learning about single level inheritance
class Single // Parent class/super class/ base class
{
	void school()
	{
		System.out.println("Checking single level");
	}
}
public class Inheritance extends Single // child class/derived class / sub class
{
	void play()
	{
		System.out.println("Static method");
	}
	public static void main(String[] args) 
	{
		System.out.println("We learning single inheritance");
		Inheritance i1=new Inheritance();
		i1.play();
		i1.school();
		
	}

}
