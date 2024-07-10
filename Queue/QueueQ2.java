import java.util.Stack;

public class QueueQ2 {
    public static class QueueC{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();


        public static boolean isEmpty() {
            return s1.empty();
        }

        public static void add(int data) {
            while (!s1.empty()) {
                s2.push(s1.pop());
            }
            s1.push(data);
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
            
        }

        public static int remove() {
            if (isEmpty()) {
                return -1;
            }
            // s1.pop();
            return s1.pop();
        }

        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            return s1.peek();
        }
    }
    
    public static void main(String[] args) {
        QueueC q = new QueueC();
        q.add(1);
        q.add(2);
        q.add(3);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
