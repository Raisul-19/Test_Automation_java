package welcome;

public class EmployeePOJOCaller {
	
	public static void main(String[] args) {
		
		EmployeePOJO empojo = new EmployeePOJO();
		
		empojo.setEmployeeName("Raisul");
		empojo.setEmployeeAge(20);
		empojo.setEmployeeDepartment("IT");
		
		
		EmployeePOJO empojo1 = new EmployeePOJO();
		
		empojo1.setEmployeeName("Islam");
		empojo1.setEmployeeAge(22);
		empojo1.setEmployeeDepartment("Business");
		
		
		EmployeePOJO empojo2 = new EmployeePOJO();
		
		empojo2.setEmployeeName("Hridoy");
		empojo2.setEmployeeAge(24);
		empojo2.setEmployeeDepartment("Medical");
		
		
		
		System.out.println(empojo.getEmployeeName());
		System.out.println(empojo.getEmployeeAge());
		System.out.println(empojo.getEmployeeDepartment());
		
		System.out.println();
		
		System.out.println(empojo1.getEmployeeName());
		System.out.println(empojo1.getEmployeeAge());
		System.out.println(empojo1.getEmployeeDepartment());
		
		System.out.println();
		
		System.out.println(empojo2.getEmployeeName());
		System.out.println(empojo2.getEmployeeAge());
		System.out.println(empojo2.getEmployeeDepartment());
		
		
	}

}
