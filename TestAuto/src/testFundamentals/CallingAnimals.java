package testFundamentals;

public class CallingAnimals {
	
	public static void main(String[] args) {
		
		Dog dog = new Dog();
		Crow cr = new Crow();
		
		
		dog.move("in the see beach");
		dog.eat();
		dog.makeSound();
		
		System.out.println();
		
		cr.move();
		cr.makeSound();
		

		
		
	}
	
}
