package oops;

public class Calculator {
	public void add(int a,int b)
	{
		System.out.println(a+b);
	}
	public void add(double a,double b)
	{
		System.out.println(a+b);
	}
	public void add(int a,double b)
	{
		System.out.println(a+b);
	}
	public void add(double a,int b)
	{
		System.out.println(a+b);
	}
	
	public void diff(int a,int b)
	{
		System.out.println(a-b);
	}
	public void diff(double a,double b)
	{
		System.out.println(a-b);
	}
	public void diff(int a,double b)
	{
		System.out.println(a-b);
	}
	public void diff(double a,int b)
	{
		System.out.println(a-b);
	}
	
	public void mul(int a,int b) 
	{
		System.out.println(a*b);
	}	
	public void mul(double a,double b)
	{
		System.out.println(a*b);
	}
	public void mul(int a,double b)
	{
		System.out.println(a*b);
	}
	public void mul(double a,int b)
	{
		System.out.println(a/b);
	}
	
	public void div(int a,int b) 
	{
		System.out.println(a/b);
	}
	public void div(double a,double b)
	{
		System.out.println(a/b);
	}
	public void div(int a,double b)
	{
		System.out.println(a/b);
	}
	public void div(double a,int b)
	{
		System.out.println(a/b);
	}

	public static void main(String[] args) {
		Calculator calc=new Calculator();
		
		calc.add(5,10);
		calc.add(5.5,10.5);
		calc.add(5,10.5);
		calc.add(5.5,10);
		
		calc.diff(5,10);
		calc.diff(5.5,10.5);
		calc.diff(5,10.5);
		calc.diff(5.5,10);
		
		calc.mul(5,10);
		calc.mul(5.5,10.5);
		calc.mul(5,10.5);
		calc.mul(5.5,10);
		
		calc.div(5,10);
		calc.div(5.5,10.5);
		calc.div(5,10.5);
		calc.div(5.5,10);
	}

}
