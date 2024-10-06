package main.com.JavaProgrammingMasterclassUpdatedToJava17.AbstractClasses.Challenge;

import java.util.ArrayList;

record OrderItem(int quantity, ProductForSale product) {}
public class Store {
    private static ArrayList<ProductForSale> productList = new ArrayList<>();
    public static void main(String[] args) {
        productList.add(new ArtObject("Oil Painting",1300,"impressionistic work by ABC painted in 2023"));
        productList.add(new ArtObject("Sculpture", 2000, "Bronze work by EDF, produced in 1950"));

        ListProducts();

        System.out.println("\nOrder 1");

        var order1=new ArrayList<OrderItem>();
        addItemToOrder(order1,1,2);
        addItemToOrder(order1,0,1);
        printOrder(order1);

        productList.add(new FurnitureObject("Char",400,"Chair from North Carolina"));
        productList.add(new FurnitureObject("Desk",375,"Mahogany Desk"));

        var order2=new ArrayList<OrderItem>();

        addItemToOrder(order2,3,5);
        addItemToOrder(order2,0,1);
        addItemToOrder(order2,2,3);
        addItemToOrder(order2,1,2);
        printOrder(order2);
    }

    public static void ListProducts(){
        for (var item : productList) {
            System.out.println("-".repeat(30));
            item.showDetails();
        }
    }

    public static void printOrder(ArrayList<OrderItem> order){
        double salesTotal=0;
        for (var item: order) {
            item.product().printPricedItem(item.quantity());
            salesTotal+=item.product().getSalesPrice(item.quantity());
        }
        System.out.format("Sales Total = $%6.2f %n", salesTotal);
    }

    public static void addItemToOrder(ArrayList<OrderItem> order, int orderIndex, int quantity){
        order.add(new OrderItem(quantity, productList.get(orderIndex)));
    }
}
