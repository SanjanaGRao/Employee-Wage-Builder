import java.util.ArrayList;

public class EmpWageUC13 implements IComputeEmpWage {
				
			public static final int IS_Part_Time = 1;
		    public static final int IS_FULL_TIME =2;
			
			private  int numOfCompany=0;
			private ArrayList<companyEmpWage> companyEmpWageArrayList;
			
			//parameterised constructor for initializing members of a class
			public EmpWageUC13()
			{
				companyEmpWageArrayList = new ArrayList<>();
			}
			
			//Method to create an object and add details of multiple companies
			public void addCompanyEmpWage(String company,int empRate,int workingDays,int maxHrs)
			{
				companyEmpWage companyEmpWage1 =new companyEmpWage(company, empRate, workingDays, maxHrs);
				companyEmpWageArrayList.add(companyEmpWage1);
				numOfCompany++;
			}
			
			//Static method to compute the wage for a particular company
			public void computeEmpWage()
			{
				for(int i=0;i<companyEmpWageArrayList.size();i++)
				{
					companyEmpWage CompanyEmpWage = companyEmpWageArrayList.get(i);
					CompanyEmpWage.setTotalEmpWage(this.computingEmpWage(CompanyEmpWage));
					System.out.println(CompanyEmpWage);
				}
			}
			
			private int computingEmpWage(companyEmpWage companyEmpWage)         
			{                                                                                             
				//variables                                                                               
			    int empHrs = 0;                                                                           
			    int empWage = 0, totalEmpWage = 0, totalWorkHrs = 0, totalWorkingDays =0;                 
			    //Computation                                                                             
			    while (totalWorkHrs <= companyEmpWage.maxHrs && totalWorkingDays < companyEmpWage.workingDays)                          
			    {                                                                                         
			    	totalWorkingDays++;                                                                   
			    	int empcheck= (int) Math.floor(Math.random() * 10) % 3;                               
			    	switch(empcheck)                                                                      
			    	{                                                                                     
			     		case IS_Part_Time: {                                                              
			     								empHrs = 8;                                                                      
			     								break;                                                    
			     							}                                                             
			     		case IS_FULL_TIME: {                                                              
			     								empHrs = 4;                                                                      
			     								break;                                                    
			     							}                                                             
			     		default: empHrs = 0;                                                              
			    	}//end of switch                                                                      
			    	totalWorkHrs += empHrs;   
			    	empWage = empHrs * companyEmpWage.empRate; //UC -13 To store daily wage
			    	totalEmpWage = companyEmpWage.empRate + totalWorkHrs;                                                               
			    }// end of while loop                                                                     
			    return totalEmpWage;
			}                                                                                             

			public static void main(String[] args) {
				IComputeEmpWage employeeWageBuilder =new EmpWageUC13();
				
				employeeWageBuilder.addCompanyEmpWage("DMart",20,20,100);
				employeeWageBuilder.addCompanyEmpWage("TATA Electronics",10,20,150);
				employeeWageBuilder.addCompanyEmpWage("Deloitte",30,20,100);
				employeeWageBuilder.computeEmpWage();             

			}


}
