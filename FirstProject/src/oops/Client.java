package oops;

public class Client {

	public static void main(String[] args) {
		/*Employee employee = new Employee();
		employee.takeSalary();	//101,"mohan","pune",45000);
		employee.printEmployeeDetails();*/
		
		Customer customer3=new Customer(1002,"mohan","pune",500);
		customer3.setBillAmount(9000);
		customer3.printCustomerDetails();
	}

}
