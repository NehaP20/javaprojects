package MKT;
public class thisCalling_Statements 
{
	thisCalling_Statements(int age)
	{
		System.out.println(age);
	}
	thisCalling_Statements(double weight)
	{	this(53);
		System.out.println(weight);
	}
	thisCalling_Statements(String name)
	{	this(19.09);
		System.out.println(name);
	}
public static void main(String[] args) 
{
	new thisCalling_Statements("Ram");
}
}
