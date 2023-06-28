package main.com.UML_Pattern.src.main.com;

public class PetStoreFactory implements AnimalFactory {

	public Animal createAnimal(String petName, String petType) {
		{
			Animal pet;

			if (petType.equals("Dog")) {
				pet = new Dog(petName);
			} else if (petType.equals("Cat")) {
				pet = new Cat(petName);
			} else {
				throw new IllegalArgumentException(petType + " is not a valid pet category.");
			}

			return pet;
		}
	}
}
