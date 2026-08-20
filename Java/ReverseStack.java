class Stack {
    int arr[];
    int size;
    int top = -1;

    Stack(int size) {
        this.size = size;
        arr = new int[size];
    }

    boolean isEmpty() {
        return top == -1;
    }

    boolean isFull() {
        return top == size - 1;
    }

    void push(int val) {
        if (isFull()) {
            System.out.println("Stack Overflow");
            return;
        }

        arr[++top] = val;
    }

    int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }

        return arr[top--];
    }

    void display() {
        for (int i = top; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class ReverseStack {
    public static void main(String[] args) {

        Stack original = new Stack(5);

        original.push(10);
        original.push(20);
        original.push(30);
        original.push(40);

        System.out.println("Original Stack:");
        original.display();

        Stack reverse = new Stack(5);

        
        while (!original.isEmpty()) { 
            reverse.push(original.pop());
        }

        System.out.println("Reverse:");
        reverse.display();
    }
}