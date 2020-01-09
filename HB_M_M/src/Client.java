import java.util.HashSet;
import java.util.Set;

import com.manytomany.AddressDetails;
import com.manytomany.EmployeeDetails;

public class Client {

	
	public static void main(String[] args) {
		
		EmployeeDetails details= new EmployeeDetails(1001, "Radha", 19000, null);
		
		AddressDetails adressdetails1 = new AddressDetails(1001, "Pune", "MH");
		AddressDetails adressdetails2 = new AddressDetails(1002, "Mumbai", "MH");
		AddressDetails adressdetails3 = new AddressDetails(1001, "Pune", "MH");
		AddressDetails adressdetails4 = new AddressDetails(1002, "Mumbai", "MH");
		
	
		Set addressSet1 = new HashSet();
		
		
		addressSet1.add(adressdetails1);
		
		addressSet2.add(adressdetails2);
		addressSet3.add(adressdetails3);
		addressSet4.add(adressdetails4);
		
		
	
	
	
	
	}
}
