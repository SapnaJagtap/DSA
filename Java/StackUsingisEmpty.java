public class StackUsingisEmpty {
    int arr[];
    int size;
    int top = -1;

    StackUsingisEmpty(int size) {
        this.size = size;
        arr = new int[size];
    }

    private boolean isEmpty() {
        return top == -1;
    }

    private void push(int val) {
        if(top == size - 1) {
            System.out.println("Stack Overflow");
            return;
        }

        top++;
        arr[top] = val;
    }

    private int pop() {
        if(isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }

        int val = arr[top];
        top--;
        return val;
    }

    private int peek() {
        if(isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }

        return arr[top];
    }

    private void display() {
        if(isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }

        for(int i = top; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StackUsingisEmpty stack = new StackUsingisEmpty(8);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display();

        System.out.println("Top element is: " + stack.peek());

        System.out.println("Popped element is: " + stack.pop());

        stack.display();
    }
}