
package exceptiondemos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo1 {
	int num1 , num2 , result;
	Scanner scanner = new Scanner(System.in);
	public void display() {
		System.out.println("Welcome in display");
		
		try {
			System.out.println("Enter 1st number:");
			num1=scanner.nextInt();
			System.out.println("Enter 2nd number:");
			num2=scanner.nextInt();
	       result=num1/num2;
	       System.out.println(result);
		}
		catch(InputMismatchException e)
		{
			System.out.println("the integer value should be their");
		}
		catch (ArithmeticException e) {
			System.out.println("divide by zero , second number must be greater than 0");
		}
		catch (Exception e) {
			System.out.println("Some otherexception");
		}
		finally
		{
			
			System.out.println("finally woith definitely called ");        // try without catch is possible with finally block
		}
		System.out.println("Bye");
		System.out.println("Main Method");
	}
	public static void main(String[] args) {
		Demo1 d =new Demo1();
		d.display();
	}
	
	
        
}
