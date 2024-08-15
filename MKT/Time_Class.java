package MKT;
import java.util.Date;
public class Time_Class 
{
	public static void main(String[] args) 
	{
		Date d1=new Date();
		System.out.println(d1.getTime()); //epoch time 
		
		Date d2=new Date(d1.getTime());
		System.out.println("Current Time->"+d2);
		
		String human=	d2.toString();
		String date=	human.substring(8, 10);
		System.out.println("Current date -->" + date);
		
		String month=	human.substring(4,7);
		System.out.println("Current month-->" + month);
		
		String year=human.substring(24);
		System.out.println("Current year-->" +year);
		
		System.out.println(date.concat("/").concat(month).concat("/").concat(year));
		
	    Date d3=new Date(d1.getTime()+(1000*60*60*24*24));
		System.out.println("Future Time->"+d3);
		
		Date d4=new Date(d1.getTime()-(1000*60*60*24*5)); //ms hh mm ss 24hrs day 
		System.out.println("Past Time->"+d4);
		
	}

}