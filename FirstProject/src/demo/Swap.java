package demo;

import java.util.Scanner;

public class Swap {
	public static void swapNo(int a, int b)
	{
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("num1="+a);
		System.out.println("num2="+b);
	}

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("enter num1");
		int num1 = scanner.nextInt();
		System.out.println("enter num2");
		int num2 = scanner.nextInt();
		scanner.close();
		Swap swap= new Swap();
		swap.swapNo(num1,num2);
	}

}
