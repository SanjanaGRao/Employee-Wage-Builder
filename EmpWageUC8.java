
public class EmpWageUC8 {
	
	public static final int IS_Part_Time = 1;
    public static final int IS_FULL_TIME =2;
    
    //class members
    private final String company;
    private final int empRate;
    private final int workingDays;
    private final int maxHrs;
    
    //Constructor for EmpWageUC8 class to initialize
    public EmpWageUC8(String company,int empRate, int workingDays, int maxHrs) 
    {
    	this.company = company;
    	this.empRate = empRate;
    	this.workingDays = workingDays;
    	this.maxHrs = maxHrs;    	
    }
    
    public void computingEmpWage(String company,int empRate, int workingDays, int maxHrs)
    {
    	//variables
        int empHrs = 0;
        int empWage = 0, totalEmpWage = 0, totalWorkHrs = 0, totalWorkingDays =0;
        //Computation
        while (totalWorkHrs <= maxHrs && totalWorkingDays < workingDays)
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
        	empWage = empRate * empHrs; //object variables
        	totalEmpWage += empWage;
        	//System.out.println("Day " + totalWorkingDays + " ");
        	//System.out.println("Employee Wage for Company " + company +": Rs. " + empWage);
        }// end of while loop
        System.out.println("Employee Wage for a month in " + company + ": Rs. " + totalEmpWage);    	
    }

	public static void main(String[] args) {
		
		EmpWageUC8 company1 = new EmpWageUC8("DMart",20,20,100); //object creation for company 1
		EmpWageUC8 company2 = new EmpWageUC8("TATA Electronics",10,20,150);//object creation for company2
		EmpWageUC8 company3 = new EmpWageUC8("Deloitte",30,20,100);//object creation for company 3
		//Using Class Method with function parameters
		company1.computingEmpWage("DMart",20,20,100); 
		company2.computingEmpWage("TATA Electronics",10,20,150);
		company3.computingEmpWage("Deloitte",30,20,100);
	}


}
