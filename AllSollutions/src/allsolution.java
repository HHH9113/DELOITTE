import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.Vector;
	

    class A extends Exception{}
    class B extends A{}
    class C extends B{}
    public class allsolution {
       static void aMethod() throws C{ throw new C(); }
       public static void main(String[] args){
       int x = 10;
        try { aMethod(); }
        catch(A e) { System.out.println("Error A");}	
       }}