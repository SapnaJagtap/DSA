import java.util.Stack;

public class StackJava{
    public static void main(String[] args)
    {
    Stack <Integer> st = new Stack<>();
    Stack <Integer> st1 = new Stack<>();
    st.push(10);
    st.push(20);
    st.push(30);
    System.out.println("Stack: " + st);
    while(!st.isEmpty()){
       st1.push(st.pop());
    }
     System.out.println(st1);
    }
}
