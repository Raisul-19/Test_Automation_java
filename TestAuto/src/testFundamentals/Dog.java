package testFundamentals;

public class Dog extends Animal {
	
	
	@Override
	public void makeSound() {
		System.out.println("Dog make sound of \"Woof Woof\"");
		
	}
	//override
	public void move() {
		System.out.println("dog can run fast");
	}
	
	public void move(String run) {
		System.out.println("dog run with man" + run);
	}
	
	
}
