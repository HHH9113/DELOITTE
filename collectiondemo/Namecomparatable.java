package collectiondemo;

import java.util.Comparator;

public class Namecomparatable implements Comparator<Customer> {

	@Override
	public int compare(Customer c1, Customer c2) 
	{
		if(c1.getCustomerName().compareTo(c2.getCustomerName())>0)
		{
			
			return 0;
		}
		
		// TODO Auto-generated method stub
		else {
		
		return -1;
	}
	}
}
