package main.com.JavaProgrammingMasterclassUpdatedToJava17.Inheritance.textFormatting;

public class main {
    public static void main(String[] args) {
        String bulletIt="Print a Bulleted List:"
                +"\n\t\u2022 First Point"+
                "\n\t\t\u2022 Sub Point";
        System.out.println(bulletIt);
        String textBlock= """
                            Print a Bulleted List:
                                    \u2022 First Point
                                        \u2022 Sub Point
                            """;
        System.out.println(textBlock);

        int age=35;
        System.out.printf("Your age is %d",age);

        int yearOfBirth =2023-age;
        System.out.format("%nYour age is %d, and your birth year is: %d",age,yearOfBirth);
        System.out.println();
        for (int i = 1; i < 100000; i*=10) {
            System.out.printf("Printing %6d %n",i);
        }

        String formattedString=String.format("Your age is %d",age);
        System.out.println(formattedString);

        formattedString="Your age is %d".formatted(age);
        System.out.println(formattedString);

        String helloWorld="Hello World";
        System.out.printf("index of l =%d %n", helloWorld.indexOf('l',3));
        System.out.printf("index of l =%d %n", helloWorld.lastIndexOf('l',8));
    }
}
