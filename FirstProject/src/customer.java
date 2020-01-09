
public class customer {  
	
private int customerId;
private String customerName;
private String customerAddress;
private int billamount;
public customer(int customerId, String customerName, String customerAddress, int billamount) {
	super();
	this.customerId = customerId;
	this.customerName = customerName;
	this.customerAddress = customerAddress;
	this.billamount = billamount;
}
@Override
public String toString() {
	return "customer [customerId=" + customerId + ", customerName=" + customerName + ", customerAddress="
			+ customerAddress + ", billamount=" + billamount + "]";
}

public void setCustomerId(int customerId) {
	this.customerId = customerId;
}

public void setCustomerName(String customerName) {
	this.customerName = customerName;
}

public void setCustomerAddress(String customerAddress) {
	this.customerAddress = customerAddress;
}

public void setBillamount(int billamount) {
	this.billamount = billamount;
}




}
