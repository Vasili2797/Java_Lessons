
public class ClassOne {
	
	int id;
	
	public int getId(){return id;}
	
	public void setId(int id) {this.id = id;}
	
	public static void main(String[] args) {
		ClassOne c1= new ClassOne();
		c1.setId(25);
		
		System.out.println(c1.getId());
		
		
	}

}
/*
public class Main {

  public static void train(Animal animal){
    animal.print();
  }

  public static void train2(Animal animal){

    if (animal instanceof Dog){
      Dog dog = (Dog) animal;
      System.out.println(dog.name + "'s color is " + dog.color);
    }
    else if (animal instanceof Rabbit){
      Rabbit rabbit = (Rabbit) animal;
      System.out.println(rabbit.name + "'s speed is " + rabbit.speed);
    }
    else if (animal instanceof Cat){
      Cat cat = (Cat) animal;
      System.out.println(cat.name + "'s jump height is " + cat.jump);
    }
  }

  public static void main(String[] args) {

    Dog dog = new Dog();

    // Upcasting
    // This is upcasting since train only takes in Animal objects. It can still take a dog object because of upcasting.

    train(dog);

    // 1) Create a Rabbit and Cat class. Make sure to add a print() method to them like the Dog class has.

    // 2) Make rabbit and cat objects. 
    Rabbit rabbit = new Rabbit();
    Cat cat = new Cat(); 

    // 3) Call the train method with the new rabbit and cat objects. 
    train(cat);
    train(rabbit);


    // Downcasting
    dog.name = "Rex";
    dog.color = "brown";
    train2(dog);

    // 4) Add a speed integer variable to the Rabbit class.
    
    // 5) Set the rabbits name to Floof (like what is happening above to the dog) and its speed to 15. 
    rabbit.name = "Floof";
    rabbit.speed = 15;
    train2(rabbit);

    // 6) Add a jump height integer variable for the Cat class. 

    // 7) Make the cats name be Tom and its jump height to 8.
    cat.name = "Tom";
    cat.jump = 8;
    train2(cat);
    // 8) Adjust the train2 method so that it checks for a rabbit and a cat just like the dog one. If it is a rabbit object then make it cast the animal object to a rabbit and then print out: rabbit.name + "'s speed is " + rabbit.speed. Do the same for if the animal object is a cat but use the Cats' name with jump height instead of speed.
    //cat.name = "Tom";
    //cat.color = "brown";
    //train2(cat);


    // 9) Call the train2 method on Bunny and Tom.
    //train2(cat);
    //train2(rabbit);


  }
}

*/


