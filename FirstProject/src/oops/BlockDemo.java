package oops;

public class BlockDemo {
	int num1=200;
	{
		System.out.println("deloitte");
	}
	static
	{
		System.out.println("static block called");
	}
	
	public BlockDemo() {
		System.out.println("cons called");
	}

	public static void main(String[] args) {
		System.out.println("main called");
		BlockDemo demo=new BlockDemo();
	}

}
