package welcome;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListCollection {
	
	public static void main(String[] args) {
		EmployeeC emp1 = new EmployeeC("Raisul", 50000, "Admin");
		EmployeeC emp2 = new EmployeeC("Islam", 40000, "IT");
		EmployeeC emp3 = new EmployeeC("Hridoy", 60000, "Finance");
		
		System.out.println(emp1.getName());
		System.out.println(emp2.getName());
		System.out.println(emp3.getName());
		
		
		ArrayList<EmployeeC> ListOfEmployees = new ArrayList<EmployeeC>();
		ListOfEmployees.add(emp1);
		ListOfEmployees.add(emp2);
		ListOfEmployees.add(emp3);
		
		// iterator
		Iterator<EmployeeC> iterator = ListOfEmployees.iterator();
		while(iterator.hasNext()) {
			System.out.println("inside list iterator : " + iterator.next().getName());
			
		}
		
		// enhanced for loop..
		for(EmployeeC emp:ListOfEmployees) {
			System.out.println("Inside Enhanced for loop : " + emp.getName());
		}
		
		
		
		
	}

}
