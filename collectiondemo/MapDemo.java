package collectiondemo;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
	
	
	public static void main(String[] args) {
		
		Map<Integer , String> allData= new TreeMap<Integer,String>();
		
		allData.put(1098, "kapil");
		allData.put(1012, "nadhi");
		allData.put(1044, "jay");
		
		
		
		System.out.println(allData);
	
	
	

		Map<Integer , String> allData1= new LinkedHashMap<Integer,String>();
		
		allData1.put(1098, "kapi");
		allData1.put(1012, "nadi");
		allData1.put(1044, "ja");
		
		
		
		System.out.println(allData1);
		
	
	
	}

}
