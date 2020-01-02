package collectiondemo;

import java.util.LinkedHashSet;
import java.util.Set;

public class demo {

public static void main(String[] args) {
	Set<String> names = new LinkedHashSet();
	
	names.add("Himanshu");
	names.add("Amar");
	names.add("Swami");
	names.add("Swami");
	names.add(159);
	System.out.println(names);
	names.add(2,"Reddy");
	System.out.println(names);
	names.remove("Swami");
	System.out.println(names);
	System.out.println(names.contains("tuffail"));
	System.out.println(names.isEmpty());
	System.out.println(names.size());
	System.out.println(names.subList(0, 2));
	
	
}
}
