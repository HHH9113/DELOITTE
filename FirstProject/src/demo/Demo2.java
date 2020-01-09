package demo;

public class Demo2 {
	
	int i=10;
	int num1=20;
	int num2=i;
	public void display()
	{
		num1=111;
		System.out.println(i+num1+num2);
	}
	public static void main(String[] args) {
		Demo2 d = new Demo2();
		d.display();
	}
}
/*
class First
{
	public void dd() {
		Demo2 d1=new Demo2();
		d1.num1=100;
		num1=99;
	}
}

class Second extends Demo2
{
	public void dd() {
		Demo2 d1=new Demo2();
		d1.num1=100;
		num1=99;
	}
}
*/