package main.com.UML_Pattern.src.main.com;

import java.io.FileReader;
import java.lang.reflect.Constructor;
import java.util.Properties;

public class UML_Pattern {

	private static String propertiesFileLocation = "/Java_Lessons/src/main/com/Creational_Design_Patterns_UML/app.properties";
	private static String factoryKey = "petstore.factory.type";

	private static AnimalFactory factory;

	public UML_Pattern(AnimalFactory factory) {
		this.factory = factory;
	}

	public static void main(String[] args) {
		UML_Pattern umlPattern = new UML_Pattern(new PetStoreFactory());
		Animal pet1 = umlPattern.orderPet("Dollar", "Dog");
		pet1.makeSound();
		pet1.moveAround();

		Animal pet2 = umlPattern.orderPet("Katz", "Cat");
		pet2.makeSound();
		pet2.moveAround();
	}

	public static AnimalFactory getFactoryFromPropertiesFile() {
		try (FileReader reader = new FileReader(propertiesFileLocation)) {
			Properties p = new Properties();
			p.load(reader);

			Class<?> clazz = Class.forName(p.getProperty(factoryKey));
			Constructor<?> constructor = clazz.getConstructor();

			return (AnimalFactory) constructor.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return factory;
		
	}

	public Animal orderPet(String petName, String petType) {
		return factory.createAnimal(petName, petType);
	}
}
