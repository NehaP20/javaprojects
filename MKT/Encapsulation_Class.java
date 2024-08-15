package MKT;
class Parent_class //lead team
{
	private int age=18;
	
	public void setAge(int age)  //setter
	{
		this.age=age;
	}
	public int getAge()    //getter
	{
		return age;
	}
}
public class Encapsulation_Class 
{
	public static void main(String[] args) 
	{
		Parent_class p1=new Parent_class();
		p1.setAge(45);
		System.out.println(p1.getAge());
	}
}
