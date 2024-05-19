import java.util.Stack;

public class Q7 {

    public static boolean isValid(String str){
        Stack<Character>s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch =='(' || ch =='{' ||ch =='[')  {
                s.push(ch);
            }else{
                if ( s.peek()=='(' ||  s.peek()=='{' || s.peek()=='[') {
                    s.pop();
                }
            }
        }
        if (!s.isEmpty()) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "(()";
        System.out.println(isValid(str));

    }
}
