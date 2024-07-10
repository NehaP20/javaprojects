package MKT;

public class NonstaticMethod_Nonparamterized 
{

	void add()
	{
		System.out.println("addition");
	}
	
	void sub()
	{
		System.out.println("subtraction");
	}
	
	public static void main(String[] args) 
	{
		
		NonstaticMethod_Nonparamterized  n1=new NonstaticMethod_Nonparamterized();
		n1.add();
		n1.sub();
		
		
		// create an object
		//classname rv=new classname();
		//rv.call non static method;
		
	}

}
