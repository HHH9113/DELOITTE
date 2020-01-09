package oops;

public class DemoStringBuffer {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("jaya");
		
		System.out.println(sb.length());
		System.out.println(sb.capacity()); //default(16)+intial(3)
		
		sb.append("mehtaaaaaaaaaaaaa");
		
		System.out.println(sb);
		
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		
	}

}
