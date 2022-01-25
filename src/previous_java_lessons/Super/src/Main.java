class Main {
  public static void main(String[] args) {

    // 6. Create a Tortoise object that utilized our Toroise constructor which takes in the name, limbs and life. Assign those values in our object and get the return of. The name should be Baloo, limbs should be bent and stubby, and life should be 150 years. 
    Tortoise Baloo= new Tortoise("Baloo","bent and shabby",150);



    // 7. Call the whoAmI method on Baloo.
    Baloo.whoAmI();

    // 8. Create a Turtle object that utilized our Turtle constructor which takes in the name, limbs, life and breath. The Name should be Squirtle, limbs should be flippers, life should be 50 and breath should be 60.
    Turtle Squirtle = new Turtle("Squirtle", "flippers", 50, 60);
    // 9. Call the whoAmI method on Squirtle.
    Squirtle.whoAmI();
 
  }
}