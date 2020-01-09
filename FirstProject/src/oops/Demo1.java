package oops;

public class Demo1 {
	int num1=500;
	int num2=900;
	
	public Demo1() {
		num1++;
		num2=++num1;
	}
	
	public Demo1(int num2, Demo1 demo) {
		num2=++this.num1;
		this.num1=--demo.num2;
		this.num2=num2++;
		demo.num1=++num2;
	}
	
	public static void main(String[] args) {
		int num1=8;
		int num2=16;
		Demo1 d1=new Demo1(); 
		Demo1 d2= new Demo1(num2,d1);
		System.out.println(d1.num1+d2.num2+num1);
		System.out.println(d2.num2+d1.num1+num2);
	}
}
