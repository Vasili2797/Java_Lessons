import java.util.*;

class Main {
  public static void main(String[] args) {

  // 5. Create an arraylist called family that can accommodate grandparents, parents and children.
    //ArrayList<String> cars = new ArrayList<String>();
    ArrayList<Grandparent> family = new ArrayList<Grandparent>();

  // 6. Create two grandparents, two parents, one child, and one droolingchild such that the final output in the loop at the bottom of the main outputs the following:
    // Mary staggers along
    // John staggers along
    // Amy walks normally with medium energy
    // Andy walks normally with low energy
    // Annie crawls forward with high energy while wearing johnson diapers
    // Tibbers crawls forward with high energy while drooling 10 liters
    Grandparent John = new Grandparent("John");
    Grandparent Mary = new Grandparent("Mary");
    Parent Amy = new Parent("Amy", "medium");
    Parent Andy = new Parent("Andy", "low");
    Child Annie = new Child("Annie", "high", "johnson");
    DroolingChild Tibbers = new DroolingChild("Tibbers", "high", 10);


    // 7. Add all these new family members to the family.
    family.add(John);
    family.add(Mary);
    family.add(Amy);
    family.add(Andy);
    family.add(Annie);
    family.add(Tibbers);

    // This should go through the family and call their walk() methods.
    for (Grandparent p : family){
      p.walk();
    }


  }
}