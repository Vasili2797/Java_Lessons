package main.com.intermediate_java_tutorial_thenewboston;

import java.util.PriorityQueue;

public class Queu_Data_Structure {
    //it is closely related to a line at the grocery store
    public static void main(String[] args) {
        //it is closely related to a line at the grocery store
        PriorityQueue<String> q= new PriorityQueue<String>();

        q.offer("first");
        q.offer("second");
        q.offer("third");

        System.out.printf("%s ", q);
        System.out.println();

        System.out.printf("%s ", q.peek());//element with the highest priority
        System.out.println();

        q.poll();
        System.out.printf("%s ", q);


    }
}
