package oops;

import java.util.StringTokenizer;

public class StringToken {
	
public static void main(String[] args) {
	String str = "feeling sleepy give us break";
	StringTokenizer token = new StringTokenizer(str);
	System.out.println(token.countTokens());
	while (token.hasMoreElements()) {
		System.out.println (token.nextElement());
		
	}
}
}
