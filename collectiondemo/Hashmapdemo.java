package collectiondemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import pack2.E;

public class Hashmapdemo {

public static void main(String[] args) {
	

 HashMap<String , Double > hm=new HashMap<String , Double>();
 
 hm.put("john doe", new Double(3434.34));
 hm.put("Tom doe", new Double(34.34));

 hm.put("jimmy doe", new Double(434.34));

 hm.put("chii doe", new Double(4.34));

 hm.put("chyy doe", new Double(344.34));

 Set set=hm.entrySet();
 
 Iterator<E> i=set.iterator();
 
 while(i.hasNext())
 {
	 
	 Map.Entry me= (Map.Entry)i.next();
	 
	 System.out.println(me.getKey()+":");
	 System.out.println(me.getValue());
	 
	 
 }
 
 System.out.println();
 
 
 
 
double  balance =((Double)hm.get("john doe")).doubleValue();
hm.put("john doe", new Double(balance +1000));


System.out.println(hm);




} 
}
