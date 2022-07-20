package main.com.intermediate_java_lessons;

import java.util.PriorityQueue;

public class priorityQueu {

    public static void main(String[] args){
        PriorityQueue<String> q = new PriorityQueue<String>();
        q.offer("first");
        q.offer("second");
        q.offer("third");

        System.out.printf("%s ",q);
        System.out.println();


        System.out.printf("%s ", q.peek());
        System.out.println();

        //whenever you are done calling a method, you often want to remove the element
        q.poll();
        System.out.printf("%s ", q);
    }
}
