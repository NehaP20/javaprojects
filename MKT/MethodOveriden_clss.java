package MKT;
class Rapid_class
{
	void Login()
	{
		System.out.println("Login with mail id");
	}	
}
public class MethodOveriden_clss 
{
	void Login()
	{
		System.out.println("Login with mobile number");
	}
	public static void main(String[] args) 
	{
		 Rapid_class r1 = new  Rapid_class ();
		 r1.Login();
		
	}
}
