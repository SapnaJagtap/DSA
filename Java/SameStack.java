//copy stack in same order
import java.util.Stack;

public class SameStack{
    public static void main(String[] args){
        Stack<Integer> st = new Stack<>();
        

        st.push(10);
        st.push(20);
        st.push(30);

        System.out.println("Original stack: " + st);

        Stack<Integer> st1 = new Stack<>();
        st1.addAll(st); //copying stack in same order
        
        System.out.println("Copied stack: " + st1);

    }

}
