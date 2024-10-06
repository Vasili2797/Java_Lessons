package main.com.JavaProgrammingMasterclassUpdatedToJava17.Immutability.External;

import main.com.JavaProgrammingMasterclassUpdatedToJava17.Immutability.Internal.PersonImmutable;
import main.com.JavaProgrammingMasterclassUpdatedToJava17.Immutability.hacker.PersonOfInterest;

public record MainImmutable() {
    public static void main(String[] args) {
        PersonImmutable Jane = new PersonImmutable("Jane","01/01/1980");
        PersonImmutable Jim = new PersonImmutable("Jim","06/18/1983");
        PersonImmutable Joe = new PersonImmutable("Joe", "10/15/1987");
        PersonImmutable[] johnsKids = {Jane, Jim, Joe};
        PersonImmutable John = new PersonImmutable("John","05/05/1950", johnsKids);
        System.out.println("The original John kids list: "+John);

        PersonImmutable[] kids = John.getKids();
        kids[0]=Jim;
        kids[1]=new PersonImmutable("Ann","04/04/1986");
        System.out.println("Added kids[0]=Jim and kids[1]=new PErsonImmutable(Ann): "+John);

        johnsKids[0]=new PersonImmutable("Ann","04/04/1986");
        System.out.println(John);

        LivingPerson johnLiving = new LivingPerson(John.getName(), John.getKids());
        System.out.println(johnLiving);

        LivingPerson anne = new LivingPerson("Ann", null);
        johnLiving.addKid(anne);
        System.out.println(johnLiving);

        PersonOfInterest johnCopy = new PersonOfInterest(John);
        System.out.println(johnCopy);
        
        kids=johnCopy.getKids();
        kids[1]=anne;
        System.out.println("johncopy: "+johnCopy);
        System.out.println("john: "+John);


    }
}
