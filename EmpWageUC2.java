
public class EmpWageUC2 {

	public static void main(String[] args) {
		//constants
        int IS_FULL_TIME =1;
        int WAGE_PER_HR =20;
        int FULL_WORKING_DAY =8;
        //variables
        int empHrs =0;
        int empWage = 0;
        //Computation
        double empcheck= Math.floor(Math.random() * 10) % 2;
        if (empcheck == IS_FULL_TIME)
        {
        	empHrs = FULL_WORKING_DAY;
        	empWage = WAGE_PER_HR * empHrs;
        }
        else
        {
        	empHrs = 0;
        	empWage = WAGE_PER_HR * empHrs;
        }
        System.out.println("Employee Wage: Rs.  " + empWage);

	}

}
