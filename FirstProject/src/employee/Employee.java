package employee;

import java.util.Scanner;

public class Employee {
	public int employeeId;
	public String employeeName;
	public String employeeAddress;
	public int salary;
	Scanner scanner = new Scanner(System.in);
	
	public void takeSalary()
	{
		
		employeeId= scanner.nextInt();
		employeeName=scanner.next();
		employeeAddress=scanner.next();
		salary=scanner.nextInt();
		scanner.close();
		
	}
	public void printEmployeeDetails()
	{
		System.out.print("Employee ID"+ employeeId);
		System.out.print("Employee Name"+ employeeName);
		System.out.print("Employee Address"+ employeeAddress);
		System.out.print("Salary"+salary);
	}

}
