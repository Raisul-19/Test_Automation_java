package oop;

public class LogicLoops {
	
	public static void main(String[] args) {
		
		for(int age = 10; age <= 25; age++) {
			
			if(age < 15) {
				System.out.println("the age is (" + age + ") so your are a child");
			}
			
			else if(age >=15 && age <= 20) {
				System.out.println("the age is (" + age + ") so your are a teenager");
			}
			else {
				System.out.println("the age is (" + age + ") so your are an adult");
			}
		}
		
		
	}

}
