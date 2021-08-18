
public class EmpWageUC3 {
	
	public static void main(String[] args) {
		//constants
		int IS_Part_Time = 1;
        int IS_FULL_TIME =2;
        int WAGE_PER_HR =20;
        //variables
        int empHrs =0;
        int empWage = 0;
        //Computation
        double empcheck= (int) Math.floor(Math.random() * 10) % 3;
        if (empcheck == IS_FULL_TIME)
        {
        	empHrs = 8;
        	empWage = WAGE_PER_HR * empHrs;
        	System.out.println("Full-time");
        }
        else if (empcheck == IS_Part_Time)
        {
        	empHrs = 4;
        	empWage = WAGE_PER_HR * empHrs;
        	System.out.println("Part-time");
        }
        else
        {
        	empHrs = 0;
        	empWage = WAGE_PER_HR * empHrs;
        }
        System.out.println("Employee Wage: Rs.  " + empWage);

	}

}
