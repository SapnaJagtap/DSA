public class Queue{
    //using linked list
    class Node{
        int data;
        Node next;

    // constructor to initialize the node
        Node(int data){ 
            this.data = data;
            this.next = null; //by default next is null so optional
        }
    }

    // front and rear pointers for the queue
    Node front, rear;

    public boolean isEmpty(){
        return front == null; //if front is null, queue is empty
    }

    public void enqueue(int data){

        Node temp = new Node(data);
        if(rear == null){ //front and rear are null means queue is empty, can use both front and rear to check if queue is empty
            front = rear = temp;
            return;
        }
        rear.next = temp; //link the new node at the end of the queue
        rear = temp; //update the rear pointer
    }

    private int dequeue(){
        if (front == null){ //if front is null, queue is empty
            return -1;
        }

        int val = front.data; //store the value to return
        front = front.next; //move the front pointer to the next node
        if(front == null){ //if queue becomes empty after dequeue, update rear to null
            rear = null;
        }
        return val;
    }

    public void display(){
        Node temp = front;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

public static void main(String[] args){
    Queue q = new Queue(); // no need to specify size for linked list implementation
    q.enqueue(10);
    q.enqueue(20);
    q.enqueue(30);
    q.enqueue(40);

    q.display();

    q.dequeue();
    q.dequeue();
    q.dequeue();
    q.dequeue();
    q.dequeue();
    q.dequeue();

    q.display();
    System.out.println("Is queue empty? \n" +   q.isEmpty());
}

}