import java.util.Stack;

public class Q3 {



public static void prtRev(String str){
    Stack<Character> s = new Stack<>();
    for (int i = 0; i < str.length(); i++) {
        s.push(str.charAt(i));
    }
    while (!s.empty()) {
        System.out.println(s.pop());
    }
}   

    public static void main(String[] args) {
        String str ="abc";
        prtRev(str);
    }
}
