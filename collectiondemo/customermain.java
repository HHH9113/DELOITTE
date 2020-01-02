package collectiondemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class customermain {

	public static void main(String[] args) {
		List<Customer> allcustomer = new ArrayList<Customer>();

		Customer c1 = new Customer(101, "jaya", "pune", 98900);
		allcustomer.add(c1);
		allcustomer.add(new Customer(102, "arun", "Mumbai", 5000));

		allcustomer.add(new Customer(102, "run", "Mumbai", 5000));
		allcustomer.add(new Customer(102, "man", "new Mumbai", 5000));

		Collections.sort(allcustomer);
		/*
		 * Iterator<Customer> i=allcustomer.iterator();
		 * 
		 * while(i.hasNext()) {
		 * 
		 * Customer str=i.next(); System.out.println(str); }
		 * 
		 */

		Scanner sc = new Scanner(System.in);

		int c = sc.nextInt();
		if (c == 1) {
			Collections.sort(allcustomer, new Namecomparatable());

			System.out.println("after sorting on names");

			System.out.println(allcustomer);
		}

		if (c == 2) {
			Collections.sort(allcustomer, new Comparator<Customer>() {

				@Override
				public int compare(Customer o1, Customer o2) {

					if (o1.getCustomerAddress().compareTo(o2.getCustomerAddress()) > 0) {

						return 0;
					}

					// TODO Auto-generated method stub
					else

						return -1;
				}
			});

			System.out.println("after sorting address");

		}

		if (c == 3) {
			Collections.sort(allcustomer);

			System.out.println("after sorting on billamount");

		}

	}

}
