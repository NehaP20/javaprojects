package MKT;

public class GlobalVariable 
{
	static double pi=3.14;//global 
	
	static void sister()
	{
		int r=10;
		double area_of_circle=pi*r*r;
		System.out.println(area_of_circle);
	}
	
	public static void main(String[] args) 
	{
		int r=7;//local
		double area=pi*r*r;
		System.out.println(area);
		
	}

}

//pi*r*r-area of circle