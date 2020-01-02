package collectiondemo;

public class Customer implements Comparable<Customer> {

	
	private int CustomerId;
	private String CustomerName;
	private String CustomerAddress;
	private int Billamount;
	public Customer(int customerId, String customerName, String customerAddress, int billamount) {
		super();
		CustomerId = customerId;
		CustomerName = customerName;
		CustomerAddress = customerAddress;
		Billamount = billamount;
	}
	
	
	public int getCustomerId() {
		return CustomerId;
	}
	public void setCustomerId(int customerId) {
		CustomerId = customerId;
	}
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public String getCustomerAddress() {
		return CustomerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		CustomerAddress = customerAddress;
	}
	public int getBillamount() {
		return Billamount;
	}
	public void setBillamount(int billamount) {
		Billamount = billamount;
	}
	@Override
	public String toString() {
		return "Customer [CustomerId=" + CustomerId + ", CustomerName=" + CustomerName + ", CustomerAddress="
				+ CustomerAddress + ", Billamount=" + Billamount + "]";
	}


	@Override
	public int compareTo(Customer o) {
		
		if(this.getBillamount()>o.getBillamount())
			return 0;
		else 
			return -1;
	}
	
	
	
	
	
}
