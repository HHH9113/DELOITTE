package oops;

public class demoString {

	public static void main(String[] args) {
		String name1 = "samriddhi";
		String name2 = "samriddhi";
		String name3 = new String ("samriddhi");
		String name4 = name1;
		
		System.out.println("..........................");
		System.out.println(name1==name3);
		System.out.println(name1==name2);
		System.out.println(name1==name4);
		System.out.println(name1.equals(name2));
		System.out.println(name1.equals(name3));
		
		System.out.println("...........................");
		System.out.println(name1.length());
		
		System.out.println("..........................");
		System.out.println(name1.concat(" shanker"));
		System.out.println(name1);
		
		System.out.println("...........................");
		name1=name1.replace('a', 'A');
		name1.replace('m', 'M');		//cant change 
		System.out.println(name1);
	}

}
