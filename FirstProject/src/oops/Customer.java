package oops;

public class Customer {
	
	private int customerId;
	private String customerName;
	private String customerAddress;
	private int billAmount=1000;
	
	public Customer() {
		//initialise here
		customerId=1001;
		customerName="NA";
		customerAddress="NA";
		billAmount=500;
		System.out.println("customer cons1 called");
	}
	
	public Customer(int customerId, String customerName, String customerAddress, int billAmount) {
		System.out.println("customer cons with 4 parameters called");		
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.billAmount = billAmount;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(int billAmount) {
		this.billAmount = billAmount;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public void customerPaidBill() {
		System.out.println("customer pay bill called");
	}
	
	public void printCustomerDetails() {
		System.out.println(".................................");
		System.out.println("customer id :" +customerId);
		System.out.println("customer name :" +customerName);
		System.out.println("customer address :" +customerAddress);
		System.out.println("customer bill amount :" +billAmount);
	}
}
