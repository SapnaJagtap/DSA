public class BinaryTree{

    static class Node{
        int data;
        Node left, right;

        Node(int val){
            this.data=val;
            left = right = null; //optional, as default is null
        }
    }
    //preorder traversal: root -> left -> right 
    // recursion method using euler traversal
    public static void display(Node root){
            if(root == null){
                return;
            }
            System.out.print(root.data + " -> ");
            if(root.left != null){
            System.out.print(root.left.data + " ");}
            else{
                System.out.print("null ");
            }
            if(root.right != null){
            System.out.print(root.right.data + " ");}
            else{
                System.out.print("null ");
            }
            System.out.println();
            display(root.left); 
            display(root.right);
        }

    //size of the tree
    static int count = 0;
    public static int preordersize(Node root){
        
        if (root == null){
            return 0;
        }
        count++;
        preordersize(root.left);
        preordersize(root.right);
        return count;
    }

    //size of the tree
    public static int size(Node root){
        if(root==null) return 0;
        return 1 + size(root.left) + size(root.right);
    }

    //sum of all nodes
    public static int sum(Node root){
        if(root == null) return 0;
        return root.data + sum(root.left) + sum(root.right);
    }

    //sum of all leaf nodes
    public static int leafsum(Node root){
        if(root == null) return 0;
        if(root.left == null && root.right == null) return root.data;
        return leafsum(root.left) + leafsum(root.right);
    }

    //height of tree
    public static int height(Node root){
        if(root == null) return 0;
        return 1 + Math.max(height(root.left), height(root.right)); 
    }


    //to find maximum value in the tree
    public static int fmax(Node root){
        if(root == null) return 1; // assuming all values are positive, return 1 for null nodes
        int a = root.data; // assuming root is not null, so a is the value of the current node
        int b = fmax(root.left); // recursively find the maximum value in the left subtree
        int c = fmax(root.right);// recursively find the maximum value in the right subtree
        return Math.max(a, Math.max(b, c)); // returning the maximum value among the three
    }

    //to find minimum value in the tree
    public static int fmin(Node root){
        if(root == null) return Integer.MAX_VALUE; // assuming all values are positive, return Integer.MAX_VALUE for null nodes
        int a = root.data;
        int b = fmin(root.left);    
        int c = fmin(root.right);
        return Math.min(a, Math.min(b, c));
    }

    public static void main(String[] args){
        Node A = new Node(10);
        Node B = new Node(20);
        Node C = new Node(30);

        A.left = B;
        A.right = C;
        //System.out.println( A.data + " -> " + A.left.data + " , " + A.right.data);

        Node D = new Node(40);
        Node E = new Node(50);
        Node F = new Node(60);
        B.left = D;
        B.right = E;
        C.left = F;
        //System.out.println( B.data+ " -> " + B.left.data + " , " + B.right.data);
        //System.out.println( C.data + " -> " + C.left.data);
        
        display(A);
        preordersize(A);
        System.out.println("Size of the tree is: " + count);             //using preorder traversal method
        System.out.println("Size of the tree is: " + size(A));          //using recursion method
        System.out.println("Sum of tree nodes: " + sum(A));
        System.out.println("Sum of leaf nodes: " + leafsum(A));
        System.out.println("Height of tree: " + height(A));
        System.out.println("Maximum value in the tree: " + fmax(A));
        System.out.println("Minimum value in the tree: " + fmin(A));
    }
}