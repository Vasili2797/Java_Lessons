package main.com.intermediate_java_lessons;

import java.util.Scanner;

public class reverseString {
    public static void main(String[] args){
        String abby ="abc", nstr="";
        char ch;

        for(int i=0; i<abby.length();i++){
            ch=abby.charAt(i);
            nstr=ch+nstr;
        }
        /*The way that the solution was presented to us
        * for(int i=abby.length() - 1;i>=0;i--){
        *   reverseAbby+=abby.charAt(i);
        * }
        *
        * System.out.println(reverseAbby);
        * */
        System.out.println(abby);
        System.out.println(nstr);

        isPalindrome();
    }

    public static void isPalindrome(){
        System.out.println("Input some String");
        Scanner scan = new Scanner(System.in);
        String input=scan.next();
        String beforePalindrome=input, afterPalindrome="";

        char ch;
        for(int i=0; i<beforePalindrome.length(); i++){
            ch=beforePalindrome.charAt(i);
            afterPalindrome= ch+afterPalindrome;
        }
        System.out.println(beforePalindrome);
        System.out.println(afterPalindrome);
        if(beforePalindrome.equals(afterPalindrome)){
            System.out.println("This is a palindrome");
        }else{
            System.out.println("This is not a palindrome");
        }
    }
}
