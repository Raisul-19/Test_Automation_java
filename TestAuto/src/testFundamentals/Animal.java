package testFundamentals;

public abstract class Animal {
	
	public void move() {
		System.out.println("It can Move..");
	}
	public void eat() {
		System.out.println("It can Eat");
	}
	public void sleep() {
		System.out.println("It can Sleep");
	}
	
	public abstract void makeSound();

}
