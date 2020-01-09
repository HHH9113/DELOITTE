package com.deloitte.week2.assignment2;

import java.util.Comparator;



	public class Employeesort implements Comparator<EmployeeVo> {

		

		public int compare(EmployeeVo o1, EmployeeVo o2) {
			int x= (int)o2.getIncometax();
					int y=(int)o1.getIncometax();
			if(x<y) {
				return 1;
			}
			else if(x==y) {
				return 0;
			}
			else if(x>y) {
				return -1;
			}
			return 0;
		}
	}


