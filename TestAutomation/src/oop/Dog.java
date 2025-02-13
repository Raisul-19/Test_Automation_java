package oop;

public class Dog extends Animal {

	@Override
	public void makeSound() {
		
		System.out.println("woof woof");
		
	}
	
	//overriding of parents class..
	public void sleep() {
		System.out.println("Dog sleep in man house");
	}
	
	//overloding of sleap method.
	public void sleep(String near) {
		System.out.println("dog sleep on.." + near);
	}

	
	
	

}
