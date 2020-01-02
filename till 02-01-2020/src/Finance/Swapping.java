
package Finance;

import java.util.Scanner;

public class Swapping {
	Scanner sc = new Scanner(System.in);
	int num1 = sc.nextInt();   //input from console
	int num2 = sc.nextInt();
	public void swap() 
	{   System.out.println("Before Swapping:" + "num1 = " + num1 + " num2 = " + num2); 
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1-num2;
		System.out.println("After Swapping:" + "num1 = " + num1 + " num2 = " + num2);
	}
	public static void main(String args[])
	{
		System.out.println("Enter Two Numbers");
		Swapping sw = new Swapping();
		sw.swap();
	}

}
