
public class EmpWageBuilderUC9 {
	
	public static final int IS_Part_Time = 1;
    public static final int IS_FULL_TIME =2;
	
	private static int numOfCompany=0;
	private static companyEmpWage[] companyEmpWageArray;
	
	//parameterised constructor for initializing members of a class
	public EmpWageBuilderUC9()
	{
		companyEmpWageArray = new companyEmpWage[5];
		
	}
	
	//Method to create an object and add details of multiple companies
	public static void addCompanyEmpWage(String company,int empRate,int workingDays,int maxHrs)
	{
		companyEmpWageArray[numOfCompany]=new companyEmpWage(company, empRate, workingDays, maxHrs);
		numOfCompany++;
	}
	
	//Static method to compute the wage for a particular company
	private static void computeEmpWage()
	{
		for(int i=0;i<numOfCompany;i++)
		{
			companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
			System.out.println(companyEmpWageArray[i]);
		}
	}

	public static void main(String[] args) {
		EmpWageBuilderUC9 employeeWageBuilder =new EmpWageBuilderUC9();
		
		employeeWageBuilder.addCompanyEmpWage("DMart",20,20,100);
		employeeWageBuilder.addCompanyEmpWage("TATA Electronics",10,20,150);
		employeeWageBuilder.addCompanyEmpWage("Deloitte",30,20,100);
		employeeWageBuilder.computeEmpWage();             

	}

}
