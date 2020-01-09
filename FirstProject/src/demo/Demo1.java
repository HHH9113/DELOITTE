 
//local and instance variable
package demo;

public class Demo1 {
	int n=10;				//variable name cant be keywords			
	float marks=90.98f;		//double value by default therefore f is needed
	Byte grade= 120;
	String String ="mohan";		//String is a class and can be used as variable
	final int DELOITTE_MARKS = 100; //cant be changed
	int i;					//instance variable (value is 0 if not initialised)
	long p=1;
	int a=(int) p;				//type casting needed
	public void display()
	{
		System.out.println("the sum is "+ (n+marks+grade));
		System.out.println("your name is " +String);
		int j=30;				//local variable initialisation is necessary
		if(n==10)
		{
			j=20;
		}
		System.out.println((i+n)-j);
		
	}
	public static void main(String[] args) {
		Demo1 d = new Demo1();	//cant use instance variable in a static method
		d.display();
	}
}
