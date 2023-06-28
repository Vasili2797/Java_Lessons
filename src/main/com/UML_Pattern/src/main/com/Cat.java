package main.com.UML_Pattern.src.main.com;

public class Cat implements Animal {
	
	String petName;
	
	public Cat(String petName) {
		this.petName = petName;
	}

	@Override
	public void makeSound() {
		System.out.println("Meow meow!");
	}

	@Override
	public void moveAround() {
		String s=petName;
		System.out.printf("I am a cat named %s and I lay around", s);
		System.out.println();
	}
}
