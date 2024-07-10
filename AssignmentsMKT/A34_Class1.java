package AssignmentsMKT;
abstract class class3
{
	abstract void add();
	abstract void sub();
}
class class2 extends class3
{
	void add() 
	{
		System.out.println("Addition Done");
	}
	void sub() 
	{
		System.out.println("Subtraction Done");
	}
	 void login_logic()
	 {
		 System.out.println("login logic");
	 }
	static void logout_logic()
	 {
		System.out.println("logout logic");	 
	 }
}
public class A34_Class1 extends class2
{
	void voice_calls()
	{
		System.out.println("calling with voice");
	}
	void video_calls()
	{
		System.out.println("calling with video");
	}
	public static void main(String[] args) 
	{
		A34_Class1 c1=new A34_Class1();
		c1.voice_calls();
		c1.video_calls();
		c1.add();
		c1.sub();
		c1.login_logic();
		logout_logic();
	}
}
