package main.com.JavaProgrammingMasterclassUpdatedToJava17.Immutability.hacker;

import main.com.JavaProgrammingMasterclassUpdatedToJava17.Immutability.Internal.PersonImmutable;

public class PersonOfInterest extends PersonImmutable{

    public PersonOfInterest(PersonImmutable person) {
        super(person);
    }

//    @Override
//    public PersonImmutable[] getKids(){
//        return super.kids;
//    }
}
