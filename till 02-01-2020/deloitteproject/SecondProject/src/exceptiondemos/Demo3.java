package exceptiondemos;

import java.util.Scanner;

class InvalidAgeException extends Exception
{
	public InvalidAgeException() {
		
	}
	public InvalidAgeException(String msg) {
		super(msg);
	}
}
class NewYearParty
{
	int eligibleAge =16 , age;
	Scanner sc = new Scanner(System.in);
	public void enterClub() throws InvalidAgeException
	{
		System.out.println("Please enter your age:");
		age=sc.nextInt();
		if(age<eligibleAge)
		{
			throw new InvalidAgeException("Under Age");
		}
		else
		{
			System.out.println("Please come.... you are eligible");
		}
	}
}

public class Demo3 {
public static void main(String[] args)  {
	
	NewYearParty d = new NewYearParty();
	try {
	d.enterClub();
	}
	catch(InvalidAgeException ui)
	{
		ui.printStackTrace();
	}
	
}
}
