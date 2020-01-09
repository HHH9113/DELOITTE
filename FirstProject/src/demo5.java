import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

class invalidage extends Exception
{
	
public invalidage()
{
	
}
invalidage(String msg)
{
super(msg)	;

}

}
class newyear
{
int eligible=16,age;
Scanner sc=new Scanner(System.in);
public void enterclub() throws invalidage
{
System.out.println("enter age");
age=sc.nextInt();

if(age<eligible)
{
	throw new invalidage("under age");
}
else
{
System.out.println("please come");	
}
}

}



public class demo5 {
	public static void main(String[] args) throws invalidage{
		newyear a=new newyear();
		try {
			a.enterclub();
		} catch (invalidage e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
