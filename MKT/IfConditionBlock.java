package MKT;
public class IfConditionBlock
{
public static void main(String[] args)
{
	int a=20;
	int b=30;
	int c=40;
	
	if (a>b)//false
	{
		System.out.println("C1");
	}
	if (b<c)//true
	{
		System.out.println("C2");
	}
	if (a>=b)//false
	{
		System.out.println("C3");
	}
	if (a<=b)//true
	{
		System.out.println("C4");
	}
	if (a==b)//false
	{
		System.out.println("C5");
	}
	if (a!=c)//true
	{
		System.out.println("C6");
	}
}
}
