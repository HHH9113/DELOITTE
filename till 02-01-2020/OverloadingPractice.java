package oops;

public class OverloadingPractice {
	public void add(int i,int j)
	{
		System.out.println("addition = " + (i+j));
	}
	public void add(double i,double j)
	{
		System.out.println("addition = " + (i+j));
	}
	public void add(int i,double j)
	{
		System.out.println("addition = " + (i+j));
	}
	public void add(double i,int j)
	{
		System.out.println("addition = " + (i+j));
	}
	public void diff(int i,int j)
	{
		System.out.println("difference = " + (i-j));
	}
	public void diff(double i,double j)
	{
		System.out.println("difference = " + (i-j));
	}
	public void diff(int i,double j)
	{
		System.out.println("difference = " + (i-j));
	}
	public void diff(double i,int j)
	{
		System.out.println("difference = " + (i-j));
	}
	public void mul(int i,int j)
	{
		System.out.println("multiplication = " + (i*j));
	}
	public void mul(double i,double j)
	{
		System.out.println("multiplication = " + (i*j));
	}
	public void mul(double i,int j)
	{
		System.out.println("multiplication = " + (i*j));
	}
	public void mul(int i,double j)
	{
		System.out.println("multiplication = " + (i*j));
	}
	public void div(int i,int j)
	{
		System.out.println("division = " + (i/j));
	}
	public void div(double i,double j)
	{
		System.out.println("division = " + (i/j));
	}

	public void div(double i,int j)
	{
		System.out.println("division = " + (i/j));
	}

	public void div(int i,double j)
	{
		System.out.println("division = " + (i/j));
	}


	public static void main(String[] args) {
		OverloadingPractice  op = new OverloadingPractice();
		System.out.println("Method overloading");
		op.add(20, 10);
		op.add(20.34, 10.56);
		op.add(20.34, 10);
		op.add(20, 10.56);
		System.out.println("----------------");
		op.diff(20, 10);
		op.diff(20.34, 10.56);
		op.diff(20.34, 10);
		op.diff(20, 10.56);
		System.out.println("----------------");
		op.mul(20, 10);
		op.mul(20.34, 10.56);
		op.mul(20.34, 10);
		op.mul(20, 10.56);
		System.out.println("----------------");
		op.div(20, 10);
		op.div(20.34, 10.56);
		op.div(20.34, 10);
		op.div(20, 10.56);
		

	}

}
