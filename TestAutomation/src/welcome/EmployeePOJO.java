package welcome;

public class EmployeePOJO {
	
	private String employeeName;
	private int employeeAge;
	private String employeeDepartment;
	
	/*
	// constuctor..
	public EmployeePOJO(String name, int age, String department) {
		
		this.employeeName = name;
		this.employeeAge = age;
		this.employeeDepartment = department;
		
	}
	
	public static void main(String[] args) {
		EmployeePOJO emp = new EmployeePOJO("Raisul Islam", 24, "CSE");
	}
	
	*/
	
	
	
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	public int getEmployeeAge() {
		return employeeAge;
	}
	public void setEmployeeAge(int employeeAge) {
		this.employeeAge = employeeAge;
	}
	
	public String getEmployeeDepartment() {
		return employeeDepartment;
	}
	public void setEmployeeDepartment(String employeeDepartment) {
		this.employeeDepartment = employeeDepartment;
	}

}
