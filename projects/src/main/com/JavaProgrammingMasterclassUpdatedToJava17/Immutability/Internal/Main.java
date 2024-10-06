package main.com.JavaProgrammingMasterclassUpdatedToJava17.Immutability.Internal;

public class Main {
    public static void main(String[] args) {
//        System.err.println("Initial Declarations");
//        Person p1=new Person();
//        p1.setName("Jane");
//        Person p2=new Person();
//        p2.setName("Jim");
//        Person p3 = new Person();
//        p3.setName("Joe");
//        Person p4=new Person();
//        p4.setName("John");
//        p4.setDob("05/05/1990");
//        p4.setKids(new Person[]{p1,p2,p3});
//        System.out.println(p4);
//
//        System.err.println("After making the changes");
//        p4.setName("Jacob");
//        p4.setKids(new Person[]{new Person(), new Person()});
//        System.out.println(p4);

        Person Jane = new Person("Jane","01/01/1980");
        Person Jim = new Person("Jim","06/18/1983");
        Person Joe = new Person("Joe", "10/15/1987");
        Person[] johnsKids = {Jane, Jim, Joe};
        Person John = new Person("John","05/05/1950", johnsKids);
        System.out.println(John);

        John.setKids(new Person[]{new Person("Ann","04/04/1980")});
        System.out.println(John);
        Person[] kids = John.getKids();
        System.out.println(John);
        kids =null;
        System.out.println(John);
        John.setKids(kids);
        System.out.println(John);
    }
}
