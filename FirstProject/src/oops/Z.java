package oops;

public class Z {
	W w= new W();
	{
		System.out.println("instance block");
	}
	static
	{
		System.out.println("static block");
	}
	public Z() {
		System.out.println("z cons");
	}

	public static void main(String[] args) {
		System.out.println("in main");
		new Z(); // same as Z z = new Z();
		new Z();
	}
}
