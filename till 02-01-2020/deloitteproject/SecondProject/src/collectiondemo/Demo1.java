package collectiondemo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class Demo1 {

public static void main(String[] args) {
	List names = new ArrayList();
	List names1 = new LinkedList();
	List names2 = new Vector();
	List names3 = new Stack();
	names.add("Himanshu");
	names.add("Amar");
	names.add("Swami");
	names.add("Swami");
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
