package oops;

public class StaticDemo {
	
	int num1=10;
	static int num2=20; //if its static no obj needed (num 2 is same for all)
	
	void change() {
		num2++;
	}
	
	static void doSomething() {
		// num1=1000;  //need obj to access
		num2=9000;
	}
	public static void main(String[] args) {
		StaticDemo d1 = new StaticDemo();
		StaticDemo d2 = new StaticDemo();
		
		d1.change();
		
		System.out.println(d1.num1);
		System.out.println(d1.num2); //same as num2 as num2 is static
		System.out.println("................");
		System.out.println(d2.num1);
		System.out.println(d2.num2);
	}

}
