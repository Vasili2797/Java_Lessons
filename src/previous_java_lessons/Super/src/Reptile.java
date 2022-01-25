class Reptile {

  String skin = "scaly";
  String name;
  String limbs;
  int life;

  public Reptile(String name, String limbs, int life){
    this.name = name;
    this.limbs = limbs;
    this.life = life;
  }

  public void whoAmI(){
    System.out.print("My name is " + name + ". I am a reptile");
  }

}