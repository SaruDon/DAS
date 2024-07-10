import java.util.*; 

public class StackQ {
    
    public static void pushBottom(Stack<Integer> s,int data) {
            //base
            if (s.isEmpty()) {
                s.push(data);
                return;
            }
            //kam
            int top = s.pop();
            pushBottom(s,data);
            s.push(top);
            
        }

    public static void reverseStack(Stack<Integer> s) {
        //base case
        if (s.empty()) {
            return;
        }

        //kaam
        int top = s.pop();
        reverseStack(s);
        pushBottom(s, top);
    }

    public static void printStack(Stack<Integer> s) {
        while (!s.empty()) {
            System.out.println(s.pop());
        }
    }

    public static void stocksSpan(int stocks[],int span[]) {
        Stack<Integer> l = new Stack<>();
        span[0]=1;
        l.push(0);
        for (int i = 1; i < stocks.length; i++) {
            while (l.isEmpty() || stocks[i]>stocks[l.peek()]) {
                l.pop();
            }
            if (l.isEmpty()) {
                span[i]=i+1;
            }else{
                int prevHigh = l.peek();
                span[i] = i-prevHigh;
            }
            l.push(i);
        }

    }
    
    public static void main(String[] args) {
        // Stack<Character> s = new Stack<>();
        // String str ="abcd";
        
        // for (int i = 0; i < str.length(); i++) {
        //     s.push(str.charAt(i));
        // }

        // pushBottom(s,4);

        // while (!s.empty()) {
        //     System.out.print(s.pop()+" ");
        // }



        //revers in Stack using stack
        // Stack<Integer> s = new Stack<>();
        // s.push(1);
        // s.push(2);
        // s.push(3);

        
        // reverseStack(s);
        // System.out.println("revsered");
        // printStack(s);


        // Quetion4
        int stocks[] ={100,80,60,70,60,85,100};
        int span [] = new int [stocks.length];
        stocksSpan(stocks,span);
        for (int i = 0; i < span.length; i++) {
            System.out.print(span[i] +" ");
        }

    }
}
