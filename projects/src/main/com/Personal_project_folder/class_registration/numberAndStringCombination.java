package main.com.Personal_project_folder.class_registration;

import java.util.Scanner;

public class numberAndStringCombination<b> {

    public static void main(String[] args){
        System.out.println("Let me try this");
        String[] intArray={"1","2","3","4","5","6","7","8","9"};
        String[] stringArray={"dog","cat","tiger", "lion","seal","zebra","elephant","bear","kitten"};

        //System.out.println(intArray[0]+" "+stringArray[0]);
        for(int i=0;i<intArray.length;i++) {
            System.out.println(intArray[i] + " " + stringArray[i]);
        }
        numberAndStringCombination nasc = new numberAndStringCombination();
        nasc.differentLoops();
        nasc.whileLoops();
    }

    static void differentLoops(){
        int k=5;
        int i, guess;

            for(i=0; i<k;i++){
                System.out.println("Please enter a number!");
                Scanner scan = new Scanner(System.in);
                int number = scan.nextInt();
            if (number == 1) {
                System.out.println("You are right! The number was equal to 1!");
                break;
            }else{
                System.out.println("You are wrong! Please guess again!");
                }
    }
    }
    //while loop
    static void whileLoops() {
        int a = 5;
        int b = 9;
        int c = 4;
            while (a < 10 && b<12 && c<10) {
                System.out.println(a + b + c);
                a++;
                b++;
                c++;
            }
    }

}
