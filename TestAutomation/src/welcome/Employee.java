package welcome;


// class is a blue print of object.
public class Employee {
	
	private String employeeName;
	private String department;
	private int salary;
	
	public void setName(String name) {
		this.employeeName = name;
	}
	public String getName() {
		return employeeName;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDepartment() {
		return department;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getSalary() {
		return salary;
	}
	
	
	public static void main(String[] args) {
		
		
		// object is a implemantation  of class.
		Employee emp = new Employee();
		emp.setName("Md Raisul Islam");
		emp.setDepartment("CSE");
		emp.setSalary(40000);
		
		System.out.println(emp.getName());
		System.out.println(emp.getDepartment());
		System.out.println(emp.getSalary());
		
		System.out.println();
		
		Employee emp2 = new Employee();
		emp2.setName("Hridoy");
		emp2.setDepartment("IT");
		emp2.setSalary(50000);
		
		System.out.println(emp2.getName());
		System.out.println(emp2.getDepartment());
		System.out.println(emp2.getSalary());
		
	}
	

}
