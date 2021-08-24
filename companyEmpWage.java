
public class companyEmpWage {
	
		 public final String company;  
		 public final int empRate;     
		 public final int workingDays; 
		 public final int maxHrs;      
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
			return "Total Employee Wage of the company "+company+ " is: Rs. "+totalWage;
					} 

}
