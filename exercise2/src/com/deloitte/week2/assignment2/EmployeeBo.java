package com.deloitte.week2.assignment2;

public class EmployeeBo {

	public void calincomeTax(EmployeeVo e) {
		

double a=e.getAnnualincome();
		if(a<250000 || a<500000 ) {
			e.setIncometax(0);
		}
		else if(a>500000 || a<1000000)
		{
			e.setIncometax((int) ((0.1)*a));
		}
		else
		{
			e.setIncometax((int) ((0.2)*a));
		}
	}
}


