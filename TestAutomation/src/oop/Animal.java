package oop;

public abstract class Animal {
	
	public void move() {
		System.out.println("It can move.");
		
	}
	public void eat() {
		
		System.out.println("It can Eat.");
	}
	public void sleep() {
		System.out.println("It can sleep");
	}
	
	public abstract void makeSound();

}
