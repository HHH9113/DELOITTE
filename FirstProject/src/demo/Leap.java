package demo;

import java.util.Scanner;

public class Leap {
	public static void check(int year)
	{
		if((year%100==0 && year%400==0 && year%4==0) || (year%4==0 && year%100!=0))
			System.out.println(year+" is a leap year");
		else
			System.out.println(year+" is not a leap year");		
	}

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("enter a year");
		int year = scanner.nextInt();
		Leap leap= new Leap();
		leap.check(year);

	}

}
