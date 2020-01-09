
public class demo3 {

	public void display1() throws Exception
	{
		System.out.println("welcome in display");
		Thread.sleep(1000);
		System.out.println("byee");
		
		
	}
	
	
	public void display2() throws InterruptedException
	{
		System.out.println("welcome in display");
		Thread.sleep(1000);
		System.out.println("byee");
	}
	
	
	
	public static void main(String[] args) throws Exception {
		System.out.println("main started");
		
		demo3 b=new demo3();
		b.display1();
		b.display2();
		System.out.println("main ended");
	}
	
}
