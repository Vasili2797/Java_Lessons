package main.com.intermediate_java_tutorial_thenewboston;

public class WileyEdge {
    public static void main(String[] args) {

    }

    String parasyticSyllable="av";
    final String vowels="AEIOUaeiou";
    String newString="";

    //pick the packages from the heaviest to the lightest one:
    //finding the heaviest package
    /*public static int solve(int weight0, int weight1, int weight2){
        int heaviestNum=0;
        if(weight0>weight1){
            if(weight0>weight2){
                return 0;
            }else{
                return 2;
            }
        }else if(weight1>weight2){
            return 1;
        }else{
            return 2;
        }
    }*/

    //finding the closest number to 0
    //int closet

}

/*
The input consists of a string
The output prints true/false based on the condition.
sample testcases:
test1:
    input:8468 output:true
test2:
    input:abcd output:false
test3:
    input: a4e5b8 output:false
* This was a Python code online
* a=input()
* if(a.isalpha():
*   print("false")
* elif(a.isdigit()):
*   print("True")
* else:
*   print("false")*/

/*
*   Print the original string in the first line
*   Number of upper case characters in the second line
*   number of lowe case characters in the third line
*
* sample output:
*   Input 1:
*   The quick Brown Fox
*   Output:
*   The quick brown fox
*   upper case characters: 3
*   lowe case characters: 13
* solution:
*   a=input()
*   u=0
*   l=0
*   for i in a:
*       if i!=' ' and i.isupper():
*           u+=1
*       elif i!=' ' and i.islower():
*           l+=1
*   print(a)
*   print('Upper case characters: '+str(u))
*   print('Lower case characters: '+str(l))
* */


/*
* Sorted list as shown in the sample output
* Sample testcases:
* 9
* 14
*43
* 46
* 27
* ...
* output:
*   [14,21,27,41,43...]
*
* Solution:
* a=int(input())
* b=[]
* for i in range(a):
*   b.append(int(input)))
* b.sort()
* print(b)*/

/*First line of the input contains String A. Second line of input contains a string B.
* Print format: Print "Yes" if the second number B is the last digits of A. Print "No" otherwise.
* refer sample input and output for formatting specifications
*
* sample tests: input: 5434554 543 sample output: no
*               input: 1234 1234 sample output: yes
*
* Solution:
*   a=int(input())
*   b=int(input())
*   t=len(str(b))
*   if(a%(int(pow(10,t)))==b):
*       print("yes")
*   else:
*       print('no')*/
