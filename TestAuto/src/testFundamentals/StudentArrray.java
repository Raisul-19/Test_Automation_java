package testFundamentals;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentArrray {
	public static void main(String[] args) {
		Studen std1 = new Studen(101, "Raisul", "B.sc");
		Studen std2 = new Studen(102, "Islam", "CSE");
		Studen std3 = new Studen(103, "Hridoy", "BBA");
		
		
		
		ArrayList<Studen> StudentList = new ArrayList<Studen>();
		StudentList.add(std1);
		StudentList.add(std2);
		StudentList.add(std3);
		
		// itaretor
		Iterator<Studen> irt = StudentList.iterator();
		while(irt.hasNext()) {
			System.out.println("Studenbt from iterator while loop : " + irt.next().getId());
			System.out.println();
			
		}
		
		for(Studen std : StudentList) {
			System.out.println("Student from enhanced for loop student Id : " + std.getId());
			System.out.println("Student from enhanced for loop student Name : " + std.getName());
			System.out.println("Student from enhanced for loop student Level : " + std.getLevel());
			System.out.println();
		}
	}
	

	


}
