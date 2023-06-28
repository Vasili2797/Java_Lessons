package main.com.JavaProgrammingMasterclassUpdatedToJava17.Pojo;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            LPAStudent s = new LPAStudent("S92300" +i,
                    switch(i){
                case 1 ->"Mary";
                case 2 -> "Carol";
                case 3 -> "Tim";
                case 4 -> "Harry";
                case 5 -> "Lisa";
                default -> "Anonymous";
            },
                    "11/05/1985",
                    "Java Masterclass");
            System.out.println(s);
        }

        Student pojoStudent =new Student("S923006","Ann","05/11/1985","Java Masterclass");
        LPAStudent recordStudent=new LPAStudent("S923007","Bill","11/05/1985","Java Masterclass");

        // The differences between the Record class and the POJO class outputs
        System.out.println();
        System.out.println(pojoStudent);
        System.out.println();
        System.out.println(recordStudent);

        pojoStudent.setClassList(pojoStudent.getClassList()+", Java OCP Exam 829");
//        recordStudent.classList(recordStudent.classList()+", Java OCP Exam 829");

        System.out.println(pojoStudent.getName() +" is taking "+ pojoStudent.getClassList());
        System.out.println(recordStudent.name() +" is taking "+ recordStudent.classList());
    }
}
