import java.util.Stack;

public class Q3 {

    public static String encodeStr(String str) {
        String temp ="", result="";
        Stack<Integer>si = new Stack<>();
        Stack<Character>sc= new Stack<>();
        int count =0;
        for (int i = 0; i < str.length(); i++) {
            char ch =str.charAt(i);
            /*
             * 
             *  30[]
             * 
             */
            if (Character.isDigit(ch)) { 
                while (Character.isDigit(str.charAt(i))) {   
                    count += count*10 + Character.getNumericValue(ch);
                    i++;
                }
                i--;
                si.push(count);
            }
            else if (ch==']') {
                temp = "";
                count = 0;
                if (!si.isEmpty()) {
                    count = si.peek();
                    si.pop();
                }
                while (!sc.isEmpty() && sc.peek() != '[') {
                    temp = sc.peek() + temp;
                    sc.pop();
                }
                if (!sc.empty() && sc.peek() == '[') {
                    sc.pop();
                }


                for (int j = 0; j < count; j++) {
                    result += temp;
                }

                for (int j = 0; j < result.length(); j++) {
                    sc.push(result.charAt(j));
                }
                result ="";
                count=0;
            }
            else if(str.charAt(i)=='['){
                sc.push(str.charAt(i));
                count=0;
            }else{
                sc.push(str.charAt(i));
                count=0;
            }
        }
        while (!sc.isEmpty()) {
            result = sc.peek() + result;
            sc.pop();
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "3[b2[v]]";
        System.out.println(encodeStr(str));
    }
}
