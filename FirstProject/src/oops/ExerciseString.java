package oops;

import java.util.StringTokenizer;

public class ExerciseString {

	public static void main(String[] args) {
		String s ="The quick brown fox jumps over the lazy dog";
		
		
		StringTokenizer tokenizer = new StringTokenizer(s);
		System.out.println(tokenizer.countTokens());

		while(tokenizer.hasMoreTokens())
		{
			System.out.println(tokenizer.nextElement());
		}
		System.out.println();
		
		
		
		System.out.println(s.charAt(12));
		System.out.println();
		
		System.out.println(s.contains("is"));
		System.out.println();
		
		//System.out.println(s.concat(" and killed it"));
		s=s.concat(" and killed it");
		System.out.println(s);
		System.out.println();
		
		System.out.println(s.endsWith("dogs"));
		System.out.println();
		
		System.out.println(s.equals("The quick brown Fox jumps over the lazy Dog"));
		System.out.println(s.equals("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG"));
		System.out.println();
		
		System.out.println("length of string=" +s.length());
		System.out.println();
		
		System.out.println(s.matches("The quick brown Fox jumps over the lazy Dog"));
		System.out.println();
		
		s=s.replace("The", "A");
		System.out.println(s);
		System.out.println();
		
		int len = s.length();
		int mid = (len+1)/2;
		String s1= s.substring(0,mid);
		String s2= s.substring(mid+1,len );
		System.out.println("statement 1: "+s1);
		System.out.println("statement 2: "+s2);
		System.out.println();
		
		String animal1= s.substring(14,18);
		String animal2= s.substring(38,41);
		System.out.println("animal 1:"+animal1);
		System.out.println("animal 2:"+animal2);
		System.out.println();
		
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println();
		
		int indexOfa = s.indexOf('a');
		System.out.println("index of 'a' is "+indexOfa );
		int lastIndex = s.lastIndexOf('e');
		System.out.println("last index of 'e' is "+lastIndex );

	}

}
