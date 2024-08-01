package AssignmentsMKT;

class ParentClass
{
	void mul()
	{
		
	}
	void add()
	{
		
	}
}
public class UpcastingClass_ extends ParentClass
{
	void mul()
	{
		
	}
	void add()
	{
		
	}
	public static void main(String[] args) 
	{
		ParentClass p1=new UpcastingClass_();
		p1.mul();
		p1.add();
		
		UpcastingClass_ u1 = (UpcastingClass_) p1;
		u1.add();
		u1.mul();
	}

}
