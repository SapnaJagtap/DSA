class Node{
    int data;
    Node next;

    Node(int data){
    this.data = data;
    this.next = null;
    }
}
    
class LinkList{
    Node head;

     public void insertAtBeginning(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        }
    

    public void insertAtEnd(int data){
        Node newNode = new Node(data);
        if (head==null){
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
       
    }

    public void insertAtPosition(int data, int pos){
        if(pos < 1){
            System.out.println("Invalid Position");
            return;
        }
        if (pos==1){
            insertAtBeginning(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        for(int i = 1; i < pos - 1 && temp != null; i++){
            temp = temp.next;
        }
        if(temp==null){
            System.out.println("Postion out of range");
            return;
        }
        newNode.next  = temp.next;
        temp.next = newNode;
    }

    public void display(){
        if (head==null){
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
        System.out.println("null");
    }  
}

public class LinkedList{
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtBeginning(5);
        list.insertAtPosition(15, 3);
        list.display();

        System.out.println("Length: " + list.lenght());
       
        
    }
}

   ///in ll nodes are inserted, not elements