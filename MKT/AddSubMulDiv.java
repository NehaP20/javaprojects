package MKT;

public class AddSubMulDiv 

{
     static void add()
     {
    	int no1=30;
    	int no2=40;
    	int sum=no1+no2;
    	System.out.println(sum);
     }
     
     static void sub()
     {
    	int no1=40;
    	int no2=20;
    	int sub=no1-no2;
    	System.out.println(sub);
     }
     
     static void mul()
     {
    	int no1=40;
    	int no2=20;
    	int mul=no1*no2;
    	System.out.println(mul);
     }
     
     static void div()
     {
    	int no1=40;
    	int no2=20;
    	int div=no1/no2;//4/2,Q=2,R=0,20/10
    	System.out.println(div);
     }
     
     static void modulus()
     {
    	int no1=40;
    	int no2=20;
    	int mod=no1%no2;//4/2,Q=2,R=0,20/10
    	System.out.println(mod);
     }
public static void main(String[] args) 
{
	
	add();
	sub();
	mul();
	div();
	modulus();
	
}
}
