class Main {

  // Class scope variable
  static int num = 5; 
  // Class scope without initialization
  static int num2;
  // Class scope reference variable. 
  static Main num3; // This is set to null since a value is not instantiated.

  /* Object scoped variable. Every Main object will have its own copy of this variable
  * that it can work with independently.
  * object scopes don't have the static keyword.
  */
  double num4 = 1.23;

  public static void main(String[] args) {
    /* Follow the instructions below and see what happens. Did you run across any issues if so
    * why do you think it happened? Leave it in a comment in the code. If you had an issue and figured it out. How did you solve it?
    */

    // 1. Print out num
    System.out.println(num);

    // 2. Change num2 to 10
    Main.num2 = 10;

    // 3. Create an instance of Main called main
    Main main = new Main();

    // 4. Print out main.num4
    System.out.println(main.num4);

    // 5. Create a new Main object called main2
    Main main2 = new Main();

    // 6. Change main.num4 to 10
    main.num4 = 10;
    System.out.println("Hello");

    // 7. Print out main2.num4
    System.out.println(main2.num4);

    // See how main2.num4 doesn't change when you chane main.num4.

    // 8. Now change main2.num2 to 15
    Main.num2 = 15;

    // 9. Print out main.num2
    System.out.println(Main.num2);

    // See how when you change main2.num2 main.num2 also changes. This is because num2 is a static variable.
  
  }
}