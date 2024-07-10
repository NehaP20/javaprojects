package AssignmentsMKT;

import java.util.Scanner;

public class ScannerAssginment 
{
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter First Name");
		String firstname= s1.next();
		System.out.println("Enter Last Name");
		String lastname= s1.next();
		System.out.println("Enter valid email ID");
		String email= s1.next();
		System.out.println("Enter valid mobile no.");
		String mobilenumber= s1.next();
		System.out.println("Please select gender");
		System.out.println("M for Male");
		System.out.println("F for Female");
		System.out.println("O for Ohers");
		String Gender= s1.next();
		System.out.println("Please fill your Permanent Address");
		String Address= s1.next();
		System.out.println("Pincode");
		String pincode= s1.next();
		System.out.println("Click on checkbox and Submit");
		String Submit= s1.next();
	}
}
