package main.com.JavaProgrammingMasterclassUpdatedToJava17.Encapsulation.Challenge;

public class App {
    public static void main(String[] args) {
        Printer printer = new Printer(50,true);
        System.out.println("initial page count="+printer.getPagesPrinted());

        int pagesPrinter=printer.printPages(5);
        System.out.printf("Current Job Pages: %d, Printer Total: %d %n",
                pagesPrinter, printer.getPagesPrinted());

        pagesPrinter=printer.printPages(10);
        System.out.printf("Current Job Pages: %d, Printer Total: %d %n",
                pagesPrinter, printer.getPagesPrinted());
    }
}
