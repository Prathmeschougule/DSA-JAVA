package oop.collectionFremwork.stack;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack <Integer> stack = new Stack<>();

//      PUSH the Element In the Stack

        stack.push(245);
        stack.push(234);
        stack.push(2);
        stack.push(23);
        stack.push(12);

        System.out.println(stack);

//      POP()  operation
        stack.pop();

        System.out.println("This is New Stack : "+stack);

//        PEEK() opration
        System.out.println("this is top of the  element : " + stack.peek());

    }
}
