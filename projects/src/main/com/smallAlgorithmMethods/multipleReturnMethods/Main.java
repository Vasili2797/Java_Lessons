package main.com.smallAlgorithmMethods.multipleReturnMethods;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        char[] testCharArray={'c', 'z', 'a', 'b', 'g', 'e', 'o'};
        char[] testCharArray2={'c', 'z', 'g', 'b', 'h', 't', 'r'};
        System.out.println(returnTheRightAnswer(testCharArray));
        System.out.println(returnTheRightAnswer(testCharArray2));
    }

    public static String returnTheRightAnswer(char[] input){

        char[] charArray={'a','e','i','o','u'};
        List<Character> newCharArrayList=new ArrayList();
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < charArray.length; j++) {
                if(charArray[j]==input[i]){
                    newCharArrayList.add(input[i]);
                }
            }
        }

        Character[] answerCharArray= new Character[newCharArrayList.size()];
        for (int i = 0; i < newCharArrayList.size(); i++) {
            answerCharArray[i]=newCharArrayList.get(i);
        }
        return Arrays.toString(answerCharArray);
    }
}
