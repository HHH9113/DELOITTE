package objectdemo;

public class Main {
	public static void main(String[] args) {
		Customer customer = new Customer(102,"tuffail", "Kanpur", 25000);
		Customer customer1 = new Customer(102,"tuffail", "Kanpur", 25000);
		System.out.println(customer.equals(customer1));
		System.out.println(customer);
		customer.setBillAmount(23000);
		customer.setCustomerName("himanshu");
		customer.setCustomerId(103);
		customer.setCustomerAddress("Ambala");
		System.out.println(customer);
		
	}

}
