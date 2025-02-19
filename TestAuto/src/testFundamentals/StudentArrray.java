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
		
		
		// iterator..
		
		Iterator<Studen> itrt = StudentList.iterator();
		
		while(itrt.hasNext()) {
			System.out.println("inside the while loop..." + itrt.next().getName());
		}
		
		// for loop
		for(Studen std:StudentList) {
			System.out.println("inside the for loop.....name == " + std.getName());
			System.out.println("inside the for loop.....ID == " + std.getId());
			System.out.println("inside the for loop.....Level == " + std.getLevel());
			
		}
	
	}
	

	


}
