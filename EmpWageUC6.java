
public class EmpWageUC6 {

	public static final int IS_Part_Time = 1;
    public static final int IS_FULL_TIME =2;
    public static final int WAGE_PER_HR =20;
    public static final int WORKING_DAYS = 20;
    public static final int WORK_HOURS = 100;
    
	public static void main(String[] args) {
		//variables
        int empHrs = 0;
        int empWage = 0, totalEmpWage = 0, totalWorkHrs = 0, totalWorkingDays =0;
        //Computation
        while (totalWorkHrs <= 100 && totalWorkingDays < 20)
        {
        	totalWorkingDays++;
        	int empcheck= (int) Math.floor(Math.random() * 10) % 3;
        	switch(empcheck)
        	{
         		case IS_Part_Time: {  
         								empHrs = 8;
         								//System.out.println("Full-time");
         								break;
         							}
         		case IS_FULL_TIME: {
         								empHrs = 4;
         								//System.out.println("Part-time");
         								break;
         							}
         		default: empHrs = 0;
        	}//end of switch
        	totalWorkHrs += empHrs;
        	empWage = WAGE_PER_HR * empHrs;
        	totalEmpWage += empWage;
        	System.out.println("Employee Wage: Rs. " + empWage);
        }// end of for loop
        System.out.println("Employee Wage for a month: Rs.  " + totalEmpWage);
	}


}
