class Child extends Parent {

  String diaperBrand;

  public Child(String name, String energy, String diaperBrand){
    super(name, energy);
    this.diaperBrand = diaperBrand;
  }

  public void walk(){
    System.out.println(name + " crawls forward with " + energy + " energy while wearing " + diaperBrand + " diapers");
  }

}