public class Stack{
    int arr[];
    int size;
    int top = -1;

    Stack(int size){
        this.size = size;
        arr = new int[size];
    }

private boolean isEmpty(){
    return top == -1;
}

private void push(int val){
    if(top == size - 1){
        System.out.println("Stack Overflow");
        return;
    }
    top++;
    arr[top] = val;
}

private int pop(){
    if(top == -1){
        System.out.println("Stack Underflow");
        return -1;
    }
    int val = arr[top];
    top--;
    return val;
}

private int peek(){
    if(top == -1){
        System.out.println("Stack is empty");
        return -1;
    }
    return arr[top];
}

private void display(){
    
    for(int i = top; i >= 0; i--){
        System.out.print(arr[i] + " ");
    }
    System.out.println();
}

public static void main(String[] args){
    Stack stack = new Stack(8);
    stack.push(10);
    stack.push(20);
    stack.push(30);
    stack.push(40);
    stack.push(50);
    stack.push(60);
    stack.push(70);
    stack.push(80);
    stack.push(90);
    stack.display();

    stack.pop();
    
    System.out.println("Popped element is: " + stack.pop());
    stack.display();

    stack.peek();
    System.out.println("Top element is: " + stack.peek());
}
}