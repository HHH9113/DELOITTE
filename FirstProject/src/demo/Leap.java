package demo;

import java.util.Scanner;

public class Leap {
	
	
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int year=input.nextInt();
        
      boolean year_result=false;
        
       if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                if ( year % 400 == 0)
                	year_result = true;
                else
                	year_result = false;
            }
            else
            	year_result = true;
        }
        else
        	year_result = false;
        if(year_result)
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");
    }
}





