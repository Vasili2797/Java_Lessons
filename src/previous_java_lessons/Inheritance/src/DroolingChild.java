// 3. Make DroolingChild extend from parent

class DroolingChild extends Parent{

  int droolAmount;

  // 4. Create a constructor for DroolingChild which calls the super constructor and passes in the name and energy value and droolAmount.
  public DroolingChild(String name, String energy, int droolAmount){
    super(name, energy);
    this.droolAmount = droolAmount;
  }


  // Overridden method. Just like what happened in the Parent class.
  @Override
  public void walk(){
    System.out.println(name + " crawls forward with " + energy + " energy while drooling " + droolAmount + " liters");
  }

}