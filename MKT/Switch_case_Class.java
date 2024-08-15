package MKT;
import java.util.Scanner;
public class Switch_case_Class 
{
	public static void main(String[] args) 
	{
		System.out.println("Press 1 for launching Chrome");
		System.out.println("Press 2 for launching Firefox");
		System.out.println("Press 3 for launching Edge");
		System.out.println("Press 4 for launching Safari");
		Scanner s1=new Scanner(System.in);
		int value=	s1.nextInt();
		
		switch (value)
		{
		case 1:
			System.out.println("Chrome Browser");
			break;
			
		case 2:
			System.out.println("Firefox Browser");
			break;
			
		case 3:
			System.out.println("Edge Browser");
			break;
			
		case 4:
			System.out.println("Safari Browser");
			break;
			
		default:
			System.out.println("Sorry your selection is wrong there is no browser with the selected option");
		}
	}
}
