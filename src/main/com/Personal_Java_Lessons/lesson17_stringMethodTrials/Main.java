package main.com.Personal_Java_Lessons.lesson17_stringMethodTrials;

public class Main {
    public static void main(String[] args){
        String str = "this is the string";
        System.out.println(str.concat(" Adding this to the original str String"));
        StringBuilder stringBuilder = new StringBuilder("new Stringbuilder ");
        System.out.println(stringBuilder.append(str));// added str to the stringBuilder
        System.out.println(stringBuilder.capacity());

        StringBuilder builder = new StringBuilder();
        System.out.println(builder.capacity());
        System.out.println(stringBuilder.insert(2, "K"));//adds the letter exactly at the index
        System.out.println(stringBuilder.deleteCharAt(5));//got rid of letter S
        //surprisinly, even though I did not assign insert to a variable, it kept the letter k after only printing

        System.out.println(stringBuilder.reverse());
        //final result after some methods were applied to the stringBuilder variable
        System.out.println(stringBuilder);
        //So StringBuilder has append method like in Python, and string has concat method. Same method, different names
    }
}
