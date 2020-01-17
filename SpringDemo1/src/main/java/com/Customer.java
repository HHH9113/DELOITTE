package com;

import java.io.Serializable;
import java.util.Set;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Customer implements Serializable,InitializingBean,DisposableBean {

	
	private String customerName;
	private int customerID;
	private String customerAddress;
	private int billAmount;
	
private ContactDetails contactdetails;

	private Set cards;

	
	
	
@PostConstruct
void dd()
{
	

}

@PreDestroy
void des()
{
	

}

	
	
	private void displayCust() {
	
		customerAddress="Not available";
		
		System.out.println("Available");
	}
	
	
	public void cleanUpMyApp()
	{
		
		System.out.println("cleaned up");
		
		
		customerAddress=null;
		
	}
	
	
	
	
	
	public Customer(String customerName, int customerID, String customerAddress, int billAmount,
			ContactDetails contactdetails, Set cards) {
		super();
		this.customerName = customerName;
		this.customerID = customerID;
		this.customerAddress = customerAddress;
		this.billAmount = billAmount;
		this.contactdetails = contactdetails;
		this.cards = cards;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + billAmount;
		result = prime * result + ((cards == null) ? 0 : cards.hashCode());
		result = prime * result + ((contactdetails == null) ? 0 : contactdetails.hashCode());
		result = prime * result + ((customerAddress == null) ? 0 : customerAddress.hashCode());
		result = prime * result + customerID;
		result = prime * result + ((customerName == null) ? 0 : customerName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (billAmount != other.billAmount)
			return false;
		if (cards == null) {
			if (other.cards != null)
				return false;
		} else if (!cards.equals(other.cards))
			return false;
		if (contactdetails == null) {
			if (other.contactdetails != null)
				return false;
		} else if (!contactdetails.equals(other.contactdetails))
			return false;
		if (customerAddress == null) {
			if (other.customerAddress != null)
				return false;
		} else if (!customerAddress.equals(other.customerAddress))
			return false;
		if (customerID != other.customerID)
			return false;
		if (customerName == null) {
			if (other.customerName != null)
				return false;
		} else if (!customerName.equals(other.customerName))
			return false;
		return true;
	}

	public Set getCards() {
		return cards;
	}

	public void setCards(Set cards) {
		this.cards = cards;
	}

	public String getCustomerName() {
		return customerName;
	}

	public ContactDetails getContactdetails() {
		return contactdetails;
	}

	public void setContactdetails(ContactDetails contactdetails) {
		this.contactdetails = contactdetails;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public int getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(int billAmount) {
		this.billAmount = billAmount;
	}

	public String getcustomerName() {
		return customerName;
	}

	public void setcustomerName(String customerName) {
		customerName = customerName;
	}

	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", customerID=" + customerID + ", customerAddress="
				+ customerAddress + ", billAmount=" + billAmount + ", contactdetails=" + contactdetails + ", cards="
				+ cards + "]";
	}

	
	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		
	}
}
