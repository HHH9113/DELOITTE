import java.util.Date;

import finance.Salary;
public class Welcome {

	public static void main(String[] args) {
		System.out.println("welcome in eclipse IDE");
		//Apple apple=new Apple
		Apple.eatApple();
		//Ball ball = new Ball();
		Ball.playBall();
		//Thanks thanks = new Thanks();
		Thanks.sayThanks();
		//Bye bye= new Bye();
		Bye.sayBye();
		//Salary s=new Salary();
		int result=Salary.calculateSalary(65000,3800);
		System.out.println(result);
		
		Date d= new Date();
		System.out.println("current date is :" +d);
	}
	
}
