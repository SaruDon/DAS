import java.util.Stack;

import QueueA.QueueArr;
import QueueA.QueueCir;
import QueueA.QueueL;
import QueueA.StackQ;

public class QueuePrac{

    static Stack<Integer>s1 = new Stack<>();
    static Stack<Integer>s2 = new Stack<>();

    public static void add(int data){
        if (s1.isEmpty()&&s2.isEmpty()) {
            s1.push(data);
        }
        else if (s1.isEmpty()&!s2.isEmpty()) {
            s1.push(data); 
        }
        s2.push(s1.pop());
    }

    public static int remove(){
        while (!s2.empty()) {
            s1.push(s2.pop());
        }
        if (s1.isEmpty()) {
            return -1;
        }
        int top = s1.peek();
        s1.pop();
        return top;
    }
    

    public static boolean isEmpty(){
        while (!s2.empty()) {
            s1.push(s2.pop());
        }
        return s1.isEmpty();
    }
    
    public static int peek(){
        while (!s2.empty()) {
            s1.push(s2.pop());
        }
        if (s1.isEmpty()) {
            return -1;
        }
        int top = s1.peek();
        return top;
    }
    
    
    public static void main(String[] args) {
        // QueueArr queue= new QueueArr(4);
        // queue.add(1);
        // queue.add(2);
        // queue.add(3);
        // queue.add(4);
        // while (!QueueArr.isEmpty()) {
        //     System.out.println(QueueArr.peek());
        //     QueueArr.remove();
        // }
        // QueueCir queue= new QueueCir(4);
        // queue.add(1);
        // queue.add(2);
        // queue.add(3);
        // queue.add(4);
        // while (!QueueCir.isEmpty()) {
        //     System.out.println(QueueCir.peek());
        //     QueueCir.remove();
        // }
        // QueueL queue= new QueueL();
        // queue.add(1);
        // queue.add(2);
        // queue.add(3);
        // queue.add(4);
        // while (!QueueL.isEmpty()) {
        //     System.out.println(QueueL.peek());
        //     QueueL.remove();
        // }
        // QueuePrac ss = new QueuePrac();
        // ss.add(1);
        // ss.add(2);
        // ss.add(3);
        // while (!ss.isEmpty()) {
        //     System.out.println(ss.peek());
        //     ss.remove();
        // }
        

        StackQ s = new StackQ();
        s.push(1);
        s.push(2);
        s.push(3);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
}
}