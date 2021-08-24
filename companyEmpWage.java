
public class companyEmpWage {
	
		 private final String company;  
		 private final int empRate;     
		 private final int workingDays; 
		 private final int maxHrs;      
		 public int totalWage;
		
		public companyEmpWage(String company,int empRate,int workingDays,int maxHrs)
		{
			this.company=company;
			this.empRate = empRate;
			this.workingDays = workingDays;
			this.maxHrs = maxHrs;
		}
		
		public void setTotalEmpWage(int totalWage)
		{
			this.totalWage=totalWage;
		}
		
		@Override
		public String toString() {
			return "Total Employee Wage of the company "+company+ " is: "+totalWage;
					}

}
