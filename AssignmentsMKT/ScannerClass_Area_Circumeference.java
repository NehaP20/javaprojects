package AssignmentsMKT;
import java.util.Scanner;
public class ScannerClass_Area_Circumeference 
{
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the value of r //Circle");
		double r=s1.nextDouble();
		double area_of_circle = Math.PI*r*r;
		double circumeference_of_circle=2*Math.PI*r;
		System.out.println("The area of circle is "+ area_of_circle);
		System.out.println("The circunference of circle is "+ circumeference_of_circle);
		
		Scanner s2=new Scanner(System.in);
		System.out.println("Enter the value of a // Sqaure");
		double a=s2.nextDouble();
		double area_of_sqaure = a*a;
		double circumeference_of_sqaure=4*a;
		System.out.println("The area of sqaure is "+ area_of_sqaure);
		System.out.println("The circunference of sqaure is "+ circumeference_of_sqaure);
		
		Scanner s3=new Scanner(System.in);
		System.out.println("Enter the value of l //rectangle");
		double l=s3.nextDouble();
		System.out.println("Enter the value of w //rectangle");
		double w=s3.nextDouble();
		double area_of_rectangle=l*w;
		double circumeference_of_rectangle=2*(l+w);
		System.out.println("The area of rectangle is "+ area_of_rectangle);
		System.out.println("The circunference of rectangle is "+ circumeference_of_rectangle);
		
		Scanner s4=new Scanner(System.in);
		System.out.println("Enter the value of h //triangle");
		double h=s4.nextDouble();
		System.out.println("Enter the value of b // triangle");
		double b=s4.nextDouble();
		double area_of_triangle=0.5*(b*h);
		double circumeference_of_triangle=3*h;
		System.out.println("The area of triangle is "+ area_of_triangle);
		System.out.println("The circunference of triangle is "+ circumeference_of_triangle);
		
		Scanner s5=new Scanner(System.in);
		System.out.println("Enter the value of h1 //trapezium");
		double h1=s5.nextDouble();
		System.out.println("Enter the value of b1 //trapezium"); // base 2
		double b1=s5.nextDouble();
		System.out.println("Enter the value of a1 //trapezium"); // base 1
		double a1=s5.nextDouble();
		double area_of_trapezium=0.5*(a1+b1)*h1;
		System.out.println("The area of trapezium is "+ area_of_trapezium);
	}
}
