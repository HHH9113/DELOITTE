package com;

public class RegularEmployee extends Employee {
	private int salary;
	private int bonus;
	public RegularEmployee(int salary, int bonus) {
		super();
		this.salary = salary;
		this.bonus = bonus;
	}
	@Override
	public String toString() {
		return "RegularEmployee [salary=" + salary + ", bonus=" + bonus + "]";
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	public RegularEmployee() {
		// TODO Auto-generated constructor stub
	}

}
