package oop;

public class Logic {
	
	public static void main(String[] args) {
		
		int age = 12;
		
		if(age >= 20) {
			System.out.println("Person is adult");
		}
		else if(age >= 12 && age < 20) {
			System.out.println("person is teenager");
		}
		else {
			System.out.println("Person is Child");
		}
		
	}

}
