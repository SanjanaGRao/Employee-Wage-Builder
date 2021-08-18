
public class EmpWageUC4 {
	
	public static final int IS_Part_Time = 1;
    public static final int IS_FULL_TIME =2;
    public static final int WAGE_PER_HR =20;
    
	public static void main(String[] args) {
        //variables
        int empHrs = 0;
        int empWage = 0;
        //Computation
        int empcheck= (int) Math.floor(Math.random() * 10) % 3;
        switch(empcheck)
         {
         	case IS_Part_Time: {  
         				empHrs = 8;
         				System.out.println("Full-time");
         				break;
         			}
         	case IS_FULL_TIME: {
         				empHrs = 4;
         				System.out.println("Part-time");
         				break;
         			}
         	default: empHrs = 0;
         }//end of switch
        empWage = WAGE_PER_HR * empHrs;
        System.out.println("Employee Wage: Rs.  " + empWage);
	}

}
