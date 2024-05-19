import java.util.Stack;

public class Q4 {
    
    public static void pushAtbottom(Stack<Character>s, char data){
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        char top = s.pop();
        pushAtbottom(s, data);
        s.push(top);
    } 


    public static void reverseStack(Stack<Character>s){
        if (s.empty()) {
            return;
        }
        char top = s.pop();
        reverseStack(s);
        pushAtbottom(s, top);
    }


    
    public static void main(String[] args) {
        String str ="abc";
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            s.push(str.charAt(i));
        }
        // while (!s.empty()) {
        //     System.out.println(s.peek());
        //     s.pop();
        // }
        System.out.println("XXXXXXXX");
        reverseStack(s);
        while (!s.empty()) {
            System.out.println(s.pop());
        }
    }
}
