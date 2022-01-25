class Tortoise extends Reptile {

  boolean parent;

  // 1. The parameters that are passed into the super() method here are called from the parent Class constructor. The super here takes in the name, limbs, and life and uses the Reptile constructor in order to create the Tortoise. As we need the same fields associated with the reptiles as a tortoise is a reptile. 

  public Tortoise(String name, String limbs, int life){
    super(name, limbs, life);
    parent = false;
  }

  @Override
  public void whoAmI(){
    super.whoAmI();
    System.out.println(" and a tortoise. My skin is " + super.skin + ".");
  }
  
}