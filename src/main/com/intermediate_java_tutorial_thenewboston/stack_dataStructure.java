package main.com.intermediate_java_tutorial_thenewboston;

import java.util.Stack;

public class stack_dataStructure {
    /*
    stack is closely related to a stack of dishes. When washing dishes, a new stack of plate it put on top of pile,
     or the stock. Or pushing the dish on the stock. So what pushing means is putting something on top of stack.
     When taking a dish off the stack, we call it popping a dish off the stack.
     pushing-putting, popping- taking off
     */
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("bottom");
        printStack(stack);

        stack.push("second");
        printStack(stack);

        stack.push("third");
        printStack(stack);

        stack.pop();
        printStack(stack);

        stack.pop();
        printStack(stack);

        stack.pop();
        printStack(stack);
    }

    private static void printStack(Stack<String> newStack){
        if(newStack.isEmpty()){
            System.out.println("You have nothing in your stack");
        }else {
            System.out.printf("%s TOP\n", newStack);
        }
    }
}
