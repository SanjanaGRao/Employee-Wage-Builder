
public interface IComputeEmpWage {
	
	public void addCompanyEmpWage(String company,int empRate,int workingDays,int maxHrs);
	public void computeEmpWage();
	public int getTotalWage(String company);
}
