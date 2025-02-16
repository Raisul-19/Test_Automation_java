package welcome;

public class EmployeeC {
	
	private String employeeName;
	private int salary;
	private String department;
	
	
	public EmployeeC(String name, int salary, String department) {
		
		System.out.println("This is in constractor of EmployeeC ");
		this.employeeName = name;
		this.salary = salary;
		this.department = department;
		
	}
	
	public String getName() {
		return employeeName;
	}
	public void setName(String name) {
		this.employeeName = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
//	public static void main(String[] args) {
//		EmployeeC emp1 = new EmployeeC("Raisul", 50000, "IT");
//		EmployeeC emp2 = new EmployeeC("Islam", 30000, "CSE");
////		EmployeeC emp3 = new EmployeeC("Hridoy", 70000, "Admin");
//		
//		
//		
//		System.out.println(emp1.getName());
//		System.out.println(emp1.getSalary());
//		System.out.println(emp1.getDepartment());
//		System.out.println();
//		
//		System.out.println(emp2.getName());
//		System.out.println(emp2.getSalary());
//		System.out.println(emp2.getDepartment());
//		System.out.println();
//		
////		System.out.println(emp3.getName());
////		System.out.println(emp3.getSalary());
////		System.out.println(emp3.getDepartment());
////		System.out.println();
//	}
	

}
