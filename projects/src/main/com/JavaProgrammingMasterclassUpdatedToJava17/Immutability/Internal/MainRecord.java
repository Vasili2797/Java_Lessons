package main.com.JavaProgrammingMasterclassUpdatedToJava17.Immutability.Internal;

public record MainRecord() {
    public static void main(String[] args) {
        PersonRecord Jane = new PersonRecord("Jane","01/01/1980");
        PersonRecord Jim = new PersonRecord("Jim","06/18/1983");
        PersonRecord Joe = new PersonRecord("Joe", "10/15/1987");
        PersonRecord[] johnsKids = {Jane, Jim, Joe};
        PersonRecord John = new PersonRecord("John","05/05/1950", johnsKids);
        System.out.println(John);

        PersonRecord johnCopy = new PersonRecord("John","05/05/1950");
        System.out.println(johnCopy);
        PersonRecord[] kids = johnCopy.kids();
        kids[0]=Jim;
        kids[1]=Jane;
        System.out.println(johnCopy);
    }
}
