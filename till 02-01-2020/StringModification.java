package oops;

public class StringModification {
	
    
	public static void main(String[] args) {
		String s = "The quick brown fox jumps over the lazy dog";
		String s1 = "The quick brown Fox jumps over the lazy Dog";
		String s3 ="THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
		System.out.println("Character At 12th index: " + s.charAt(12));
		System.out.println("String Contain is or not: " + s.contains("is"));
		s = s.concat(" and killed it");
		System.out.println(s);
		System.out.println( "The string ends with dogs or not: " +s.endsWith("dogs"));
		System.out.println("S and S1 is equal or not: " + s.equals(s1));
		System.out.println("S and S3 is euqal or not: " + s.equalsIgnoreCase(s3));
		System.out.println("Length of the string: " + s.length());
		System.out.println("String matches or not: " + s.matches(s1));
		System.out.println("Replacing The with A: " + s.replaceAll("The", "A"));
		String array2[]= s.split("jumps", 2);
		for (String temp: array2){
		      System.out.println(temp);
		}

		System.out.println("Animals name: ");
		System.out.println("lowercase: " + s.toLowerCase());
		System.out.println("Uppercase: " + s.toUpperCase());
		System.out.println("Index of a in string: " + s.indexOf('a'));
		System.out.println("Last index of e in string: " + s.lastIndexOf('e'));


	}

}
