package employee;

import java.util.Scanner;


public class Employee {
	public int employeeId;
	public String employeeName;
	public String employeeAddress;
	public int salary;
	Scanner sc = new Scanner(System.in);
	public void takeSalary()
	{
		System.out.println("Enter employee details:");
		System.out.println("Enter employee Id:");
		employeeId = sc.nextInt();
		System.out.println("Enter employee Name:");
		employeeName = sc.next();
		System.out.println("Enter employee Address:");
		employeeAddress = sc.next();
		
		System.out.println("Enter employee salary:");
		salary=sc.nextInt();
		
	}
	 
	public void printEmployeeDetails() 
	{ 
		System.out.println("Employee Id" + employeeId);
		System.out.println("Employee Name" + employeeName);
		System.out.println("Employee Adress" + employeeAddress);
		System.out.println("Employee Salary" + salary);
	}
	

}
