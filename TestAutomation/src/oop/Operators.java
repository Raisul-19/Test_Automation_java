package oop;

public class Operators {
	
	public static void main(String[] args) {
		
		// arithmatic operation.
		int x = 5;
		int y = 10;
		int z = x+y;
		
		System.out.println("The sum of x and y is z = " + z);
		
		// Relational operation..
		if(x > y) {
			System.out.println("x is a larger number from y");
		}
		else {
			System.out.println("y is a larger number from x");
		}
		
		
		// Logical Operation..
		
		if(x > z && x > y) {
			System.out.println("x is larger from all numbers");
		}
		else if(y > z && y > x) {
			System.out.println("y is larger number from all numbers");
		}
		else {
			System.out.println("z ( the sum of x and y) is larger number from all");
		}
		
		
		// or logic
		if(x > y || z > y) {
			System.out.println("z is larger...");
		}
		
		
		
	}
	

}
