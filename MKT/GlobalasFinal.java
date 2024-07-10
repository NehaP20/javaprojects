package MKT;
public class GlobalasFinal 
{
	 final static double pi=3.14;
	 
	 static void area() 
	 {
		 int r=10;
		 double area_of_circle=pi*r*r;
		 System.out.println(area_of_circle);
	 }
	 static void circumferance() // 2*pi*r*
	 {
		 int r=15;
		 double circumferance_of_circle=2*pi*r;
		 System.out.println(circumferance_of_circle);
	 }
	 
	
public static void main(String[] args)
{
	area();
	circumferance();
	
}
}
