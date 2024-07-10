package AssignmentsMKT;
class Rapid_class
{
	void Facebook()
	{
		System.out.println("Login with mail id");
	}	
}
public class MethodOverride extends Rapid_class
{
	void Facebook()
	{
		super.Facebook();
		System.out.println("Login with mobile number");
	}
public static void main(String[] args) 
{
	MethodOverride m1=new MethodOverride ();
	m1.Facebook();
	
}
}
