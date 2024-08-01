package MKT;

public class throw_throws_Class 
{
	public static void main(String[] args) throws NullPointerException, InterruptedException
	{
		System.out.println("Hello");
		Thread.sleep(5000); //1 sec = 1000 ms
		System.out.println("Bye");
		throw new NullPointerException();
	}

}
