package AssignmentsMKT;
class Rapid_class
{
	void Facebook()
	{
		System.out.println("Login with mail id");
	}	
}
public class SuperKeyword_MethodOverride extends Rapid_class
{
	void Facebook()
	{
		super.Facebook();
		System.out.println("Login with mobile number");
	}
public static void main(String[] args) 
{
	SuperKeyword_MethodOverride m1=new SuperKeyword_MethodOverride ();
	m1.Facebook();
	
}
}
