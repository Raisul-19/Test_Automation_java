package testFundamentals;

import java.util.Scanner;

public class EmployeeCall {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter your name : ");
		String name = scn.next();
		System.out.println("Enter your salary");
		int salary = scn.nextInt();
		System.out.println("Enter your department");
		String department = scn.next();
		
		 Employee emp = new Employee();
		 emp.setName(name);
		 emp.setSalary(salary);
		 emp.setDepartment(department);
		 
		 
		 
		 
		 System.out.println(emp.getName());
		 System.out.println(emp.getSalary());
		 System.out.println(emp.getDepartment());
		 
		 
	}

}
