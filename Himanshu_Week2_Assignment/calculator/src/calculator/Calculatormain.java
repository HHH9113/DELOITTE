package calculator;

import java.util.Scanner;

public class Calculatormain {

	public static void main(String[] args) {
		
		Object[] fs = {new Additionclass(), new Sub(), new Multiplicationclass(), new Divisionclass(), new Exit()};
		System.out.println("Enter your choice:\n1. Add\n2. Sub\n3. Multiply\n4. Divide\n5. Exit");
		int input;
		Scanner sc = new Scanner(System.in);
		input = sc.nextInt();
		int num1, num2;//  = 12, num2 = 6;
		System.out.println("Enter two numbers: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		int y = ((Arithmeticclass)fs[input-1]).calc(num1, num2);
		System.out.println(y);
		sc.close();

	}
}