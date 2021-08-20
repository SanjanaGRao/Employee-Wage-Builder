
public class EmpWageUC7 {
	
	public static final int IS_Part_Time = 1;
    public static final int IS_FULL_TIME =2;
    
    //class members
    private final String company;
    private final int empRate;
    private final int workingDays;
    private final int maxHrs;
    
    //Constructor for EmpWageUC7 class to initialize
    public EmpWageUC7(String company,int empRate, int workingDays, int maxHrs) 
    {
    	this.company = company;
    	this.empRate = empRate;
    	this.workingDays = workingDays;
    	this.maxHrs = maxHrs;    	
    }

	public static void main(String[] args) {
		
		EmpWageUC7 obj1 = new EmpWageUC7("DMart",20,20,100); //object creation
		//variables
        int empHrs = 0;
        int empWage = 0, totalEmpWage = 0, totalWorkHrs = 0, totalWorkingDays =0;
        //Computation
        while (totalWorkHrs <= obj1.maxHrs && totalWorkingDays < obj1.workingDays)
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
        	empWage = obj1.empRate * empHrs; //object variables
        	totalEmpWage += empWage;
        	System.out.println("Day " + totalWorkingDays + " ");
        	System.out.println("Employee Wage for Company " + obj1.company +": Rs. " + empWage);
        }// end of for loop
        System.out.println("Employee Wage for a month: Rs.  " + totalEmpWage);
	}

}
