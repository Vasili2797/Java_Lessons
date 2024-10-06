package main.com.JavaProgrammingMasterclassUpdatedToJava17.AbstractClasses.Challenge;

public abstract class ProductForSale {
    protected String type;
    protected double price;
    protected String description;

    public ProductForSale(String type, double price, String description){
        this.type=type;
        this.price=price;
        this.description=description;
    }

    public double getSalesPrice(int productAmount){
        return productAmount*price;
    }

    public void printPricedItem(int productAmount){
        System.out.printf("%2d qty at $%8.2f each, %-15s %-35s %n",
                productAmount, price, type, description);
    }

    public abstract void showDetails();
}
