package JavaPractice;

public class thiskeyword_Class 
{
	int age;
	String name;
	double salary;
	void student_details(int age, String name, double salary)
	{
		this.age=age;
		this.name=name;
		this.salary=salary;
	}
	public static void main(String[] args) 
	{
		thiskeyword_Class t1= new thiskeyword_Class();
		t1.student_details(28, "Neha", 87500);
		System.out.println(t1.salary);
		System.out.println(t1.name);
		System.out.println(t1.age);
	}

}
