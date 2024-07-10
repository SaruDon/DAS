import java.util.Stack;

public class Q2 {
    Stack<Integer> s = new Stack<>();
    public static void pushatBottom(Stack<Integer> s , int data){
        // break
        if (s.empty()) {
            s.push(data);
            return;
        }
        
        // kam
        int top = s.pop();
        pushatBottom(s, data);
        s.push(top);
    }

    public static void main(String[] args) {
       int data = 4;    
    }
}
