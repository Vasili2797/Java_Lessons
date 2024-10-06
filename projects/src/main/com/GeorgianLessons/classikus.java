package main.com.GeorgianLessons;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args){
        String haystack="sadbutsad";
        String needle="sad";
        System.out.println(strStr(haystack, needle));
        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
    }
    public static int strStr(String haystack, String needle) {
        String finishedString;
        StringBuilder s=new StringBuilder("");
        int index=0;
        for(int i=0;i<haystack.length();i++){
            char c = haystack.charAt(i);
            for(int j=0;j<needle.length()+1;j++){
                s.append(c);
            }
            finishedString=s.toString();
            // while(s!=needle)
            if(finishedString.length()==needle.length() && finishedString.equals(needle)){
                index=haystack.charAt(i);
            }else if(!(s.equals(needle))){
                index=-1;
            }
        }
        return index;
    }

    public static int lengthOfLastWord(String s){
        String[] strArray=s.split(" ");
        String lastWord=null;
        for(int i=0;i<strArray.length;i++){
            lastWord=strArray[i];
        }
        int size=lastWord.length();
        return size;
    }

    public int[] plusOne(int[] digits){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<digits.length;i++){
            sb.append(digits[i]);
        }
        int number = Integer.valueOf(String.valueOf(sb));
        int result=number+1;
        String temp=Integer.toString(result);
        int[] numbers=new int[temp.length()];
        return numbers;
    }
}