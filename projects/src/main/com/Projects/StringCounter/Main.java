package main.com.Projects.StringCounter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Create a scanner that will read the input of the user
        System.out.println("Welcome to the counter app. This app uses scanner to read and count words, and characters");
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        String scannedString=null;
        try {
            scannedString = scan.readLine();
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
        System.out.println("You wrote: "+scannedString);
        System.out.println("The empty space in the string is: "+emptyCharacterCounter(scannedString));
        System.out.println("The characters in input without spaces: "+characterCounterWithoutSpace(scannedString));
        System.out.println(differentWordCounter(scannedString));
        System.out.println("The amount of special characters is: "+amountOfSpecialCharacters(scannedString));
    }

    private static int emptyCharacterCounter(String string){
        int emptySpaceCounter=0;
        if(string.isEmpty() || string==null){
            return 0;
        }

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == ' '){
                emptySpaceCounter++;
            }
        }
        return emptySpaceCounter;
    }

    private static int characterCounterWithoutSpace(String string){
        int stringLength=string.length();
        return stringLength-emptyCharacterCounter(string);
    }

    private static int differentWordCounter(String string){
        String[] wordStr;
        wordStr=string.split(" ");
        System.out.println(Arrays.toString(wordStr));
        System.out.println("The amount of words used: "+wordStr.length);
        Set<String> setData = new HashSet<>();

        for (int i = 0; i < wordStr.length; i++) {
            setData.add(wordStr[i]);
        }
        // At this moment, the code write to me the unique words that were written there.
        System.out.println(setData);
        System.out.println("The amount of unique words used: ");
        return setData.size();
    }

    private static int amountOfSpecialCharacters(String string){
        char[] specChar = {'!','"', '#', '$','%','^','&',
                            '*','\'','(',')','+','-',':','<',
                            '>',':',';','|','=','?','@','[',
                            ']','{','}','_','~', ',', '.'};
//        String specChar=" !\"#$%&'()*+,-./:;<=>?@[\]^_`{|}~";
//        for (int i = 0; i < specChar.length; i++) {
//            System.out.println(specChar[i]);
//        }
        int amount=0;
        for (int i = 0; i < specChar.length; i++) {
            for (int j = 0; j < string.length(); j++) {
                if (string.charAt(j) ==specChar[i]){
//                    System.out.println(string.charAt(j));
                    amount+=1;
                }
            }
        }
        return amount;
    }
}

//This is the string. Let us see. Hopefully, everything will be good?