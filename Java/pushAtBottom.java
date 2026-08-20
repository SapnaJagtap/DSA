//push at bottom

import java.util.Stack;

public class pushAtBottom{
public static void main(String[] args) {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> stack1 = new Stack<>();
    
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    stack.push(5);

    System.out.println("Original Stack: " + stack);

    while (!stack.isEmpty()) {
        stack.push(stack.pop());
    }
    stack.push(0); // to push 0 at bottom
        while (!stack1.isEmpty()) {
            stack.push(stack1.pop());
    }

    System.out.println("Stack after pushing at bottom: " + stack);
}
}