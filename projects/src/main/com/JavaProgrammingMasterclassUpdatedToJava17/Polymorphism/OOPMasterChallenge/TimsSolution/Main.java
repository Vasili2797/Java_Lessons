package main.com.JavaProgrammingMasterclassUpdatedToJava17.Polymorphism.OOPMasterChallenge.TimsSolution;

public class Main {
    public static void main(String[] args) {
//        Item coke = new Item("drink","coke",1.50);
//        coke.printItem();
//        coke.setSize("LARGE");
//        coke.printItem();
//
//        Item avocado=new Item("Topping","avocado",1.50);
//        avocado.printItem();

//        Burger burger = new Burger("regular",4.00);
//        burger.addTopings("BACON","CHEESE","MAYO");
//        burger.printItem();

//        MealOrder regularMeal=new MealOrder();
//        regularMeal.addBurgerToppings("BACON","CHEESE","MAYO");
//        regularMeal.setDrinkSize("LARGE");
//        regularMeal.printItemizedList();

        MealOrder secondMeal = new MealOrder("turkey", "7-up", "chili");
        secondMeal.addBurgerToppings("LETTUCE", "CHEESE", "MAYO");
        secondMeal.setDrinkSize("SMALL");
        secondMeal.printItemizedList();

        MealOrder deluxeBurger=new MealOrder("deluxe","Pepsi","chili");
        deluxeBurger.addBurgerToppings("AVOCADO","BACON","LETTUCE","CHEESE","MAYO");
        deluxeBurger.setDrinkSize("SMALL");
        deluxeBurger.printItemizedList();


//        // Combine two different int arrays;
//        int[] intArray1 = {1, 2, 3, 4, 5, 6, 7};
//        int[] intArray2 = {1, 2, 5, 7, 11, 13, 15};
//        ArrayList<Integer> arrayListOfIntegers = new ArrayList<>();
//        for (int i = 0; i < intArray1.length; i++) {
//            arrayListOfIntegers.add(i);
//        }
//        for (int i = 0; i < intArray2.length; i++) {
//            arrayListOfIntegers.add(i);
//        }
//        System.out.println("Unsorted arrayList of the arrays:\n"+arrayListOfIntegers);
//        Collections.sort(arrayListOfIntegers);
//        for(int number : arrayListOfIntegers){
//            System.out.format("%d ",number);
//        }
//        System.out.println();
    }
}
