 // 2. Create a class Turtle that inherits from Reptile. 
 
 public class Turtle extends Reptile{


    // 3. Create a instance variable that will hold the length of time our turtle will hold it's breath.
    //float holdBreath
    public int holdBreath;

    // 4. Make a constructor that takes in variables for the reptile super constructor. Make sure to get a value in the constructor to initialize breath.
    public Turtle(String name, String limbs, int life, int holdBreath) {
      //Reptile();
      super(name, limbs, life);
      this.holdBreath = holdBreath;
      
      
    }

    // 5. Override the whoAmI() method. Make sure to use the super method like in the Tortoise class. My name is Squirtle. Sample output for whoAmI: "I am a reptile and a turtle. My skin is scaly. I can hold my breath for 60 minutes.""
    
    public void whoAmI(){
      System.out.print("My name is " + name + ". I am a reptile and a turtle. My skin is "+skin +". I can hold my breath for "+holdBreath + " minutes");
    }}