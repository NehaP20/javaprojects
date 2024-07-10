package AssignmentsMKT; // Abstract Class
abstract class Delhi
{
	abstract void delhi_roads();
	abstract void delhi_hospitals();
}
public class Bangalore extends Delhi
{
	void delhi_roads() 
	{
		System.out.println("Checking as per concepts 1");
		
	}
	void delhi_hospitals() 
	{
		System.out.println("Checking as per concepts 2");
	}
public static void main(String[] args)
{
	
	
}
}
