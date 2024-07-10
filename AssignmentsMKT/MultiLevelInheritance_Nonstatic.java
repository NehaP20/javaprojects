package AssignmentsMKT;
class Amazon_website
{
	void Amazon()
	{
		System.out.println("Online Shopping");
	}
}
class Google_website extends Amazon_website
{
	void Google()
	{
		System.out.println("Online Jobs");
	}
}
public class MultiLevelInheritance_Nonstatic extends Google_website 
{
	void Neha()
	{
		System.out.println("Auth Google & Amazon");
	}
	public static void main(String[] args) 
	{
		MultiLevelInheritance_Nonstatic m1=new MultiLevelInheritance_Nonstatic();
		m1.Amazon();
		m1.Google();
		m1.Neha();
		
	}

}
