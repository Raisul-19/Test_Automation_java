package welcome;

public class Top2Bottom {
	
	private String name;
	private int age;
	
	public static void multiply(int number1, int number2) {
		
		int product = 0;
		
		product = number1 * number2;
		System.out.println("The Peoduct is (" + number1 + " x " + number2 + ") = " + product);
		
	}
	
	public static void division(int number1, int number2) {
		
		int division;
		division = number1 / number2;
		
		System.out.println("The Division of (" + number1 + " / " + number2 + ") = " + division);
	}
	
	public static void main(String[] args) {
		
		multiply(5, 5);
		division(15, 3);
	}
	

}
