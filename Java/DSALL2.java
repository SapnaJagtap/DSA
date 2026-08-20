class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;
    Node tail; // Keeping tail gives O(1) insert at end
    
    // OP 1: Insert at Beginning - Head Insertion
    // Time: O(1) | Space: O(1)
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        if (tail == null) tail = newNode; // if first node
    }

    // OP 2: Insert at End - Tail Insertion  
    // Time: O(1) with tail pointer | O(n) without tail | Space: O(1)
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;  // Direct attach because we have tail
        tail = newNode;
    }

    // OP 3: Insert at Specific Position - 1 based indexing
    // Time: O(n) | Space: O(1)
    public void insertAtPosition(int data, int pos) {
        if (pos < 1) {
            System.out.println("Invalid position");
            return;
        }
        if (pos == 1) {
            insertAtBeginning(data);
            return;
        }
        
        Node newNode = new Node(data);
        Node temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }
        
        if (temp == null) {
            System.out.println("Position out of range");
            return;
        }
        
        newNode.next = temp.next;
        temp.next = newNode;
        
        if (newNode.next == null) tail = newNode; // update tail if inserted at end
    }

    // OP 4: Insert After a given value
    // Time: O(n) | Space: O(1)
    public void insertAfterValue(int data, int key) {
        Node newNode = new Node(data);
        Node temp = head;
        while (temp != null && temp.data != key) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println(key + " not found");
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        if (newNode.next == null) tail = newNode;
    }

    // OP 5: Insert in Sorted Order - for sorted list
    // Time: O(n) | Space: O(1)
    public void insertSorted(int data) {
        Node newNode = new Node(data);
        if (head == null || head.data >= data) {
            insertAtBeginning(data);
            return;
        }
        Node temp = head;
        while (temp.next != null && temp.next.data < data) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        if (newNode.next == null) tail = newNode;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class DSALL2 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtEnd(10);          // 10
        list.insertAtBeginning(5);     // 5 -> 10
        list.insertAtPosition(15, 3);  // 5 -> 10 -> 15
        list.insertAfterValue(12, 10); // 5 -> 10 -> 12 -> 15
        list.insertSorted(7);          // 5 -> 7 -> 10 -> 12 -> 15
        list.display();
    }
}