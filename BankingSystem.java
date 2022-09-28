package exrecise2;
	public class BankingSystem{
	    private Double rateOfintrest=1.2;
	    private String pName="	Utsav Sharma";
	    private int accountNo= 46734;
	    private int salary=300;
	public BankingSystem() {}
	    public BankingSystem(double rateOfintrest, String pName,int accountNo, int salary) {
	        this.rateOfintrest = rateOfintrest;
	        this.pName = pName;
	        this.accountNo = accountNo;
	        this.salary = salary;
	    }
	    
	    public double getRateOfintrest() {
	        return rateOfintrest;
	    }
	    public void setRateOfintrest(double rateOfintrest) {
	        this.rateOfintrest = rateOfintrest;
	    }
	    public String getName() {
	        return pName;
	    }
	    public void setpName(String pName) {
	        this.pName = pName;
	    }
	    public int getAccountNo() {
	        return accountNo;
	    }
	    public void setAccountNo(Integer accountNo) {
	        this.accountNo = accountNo;
	    }
	    public int getsalary() {
	        return salary;
	    }
	    public void setSalary(int salary) {
	        this.salary = salary;
	    }

	}

