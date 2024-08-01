package AssignmentsMKT;

public class Widening_Assgn 
{
	public static void main(String[] args) 
	{
		//implicit manner // explicit manner // widening
		byte b1 = (byte) 128;
		int i1 = b1;
		System.out.println(i1);
		
		byte b2 = 127;
		int i2 = b2;
		System.out.println(i2);
		
		//narrowing //explicitly
		int a1 = 545268791;
		byte b = (byte) a1;
		System.out.println(b);
				
		//narrowing //explicitly
		double d = 3.5682345612;
		float f = (float) d;
		System.out.println(f);
	}

}
