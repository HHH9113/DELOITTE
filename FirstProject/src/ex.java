import java.util.InputMismatchException;
import java.util.Scanner;

public class ex {
int a,b,c;

Scanner sc=new Scanner(System.in);
/**
 * 
 */
public void display()

{
System.out.print("welcome in display");
try
{

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	System.out.print("enter 1st no");
	a=sc.nextInt();
	System.out.print("enter 2nd no");

	b=sc.nextInt();
	c=a/b;
	System.out.print(c);


	
}
catch(InputMismatchException e1)
{
	System.out.print("there should be integer value");


}
catch(ArithmeticException e)
{
	System.out.print("no. must be greater than 0");
	
}
}

public static void main(String[] args) {
	ex t=new ex();
	t.display();
}



}
