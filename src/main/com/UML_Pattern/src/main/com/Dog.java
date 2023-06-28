package main.com.UML_Pattern.src.main.com;

public class Dog implements Animal {
	String petName;
	
	public Dog(String petName) {
		this.petName = petName;
	}

	@Override
	public void makeSound() {
		System.out.println("woof woof!");
	}

	@Override
	public void moveAround() {
		String s = petName;
		System.out.printf("I am a dog named %s and I am moving around", s);
		System.out.println();
	}
}
