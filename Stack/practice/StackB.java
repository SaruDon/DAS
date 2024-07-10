import java.util.ArrayList;
import ll.Node;

public class StackB {
    public static class StackA{
    
    public static boolean isEmpty(){
        if (Node.head ==  null) {
            return true;
        }
        return false;
    }
    
    
    public static void push( int data){
        Node newNode = new Node(data);
        if (isEmpty()) {
            Node.head =newNode;
            return;
        }
        newNode.next= Node.head;
        Node.head = newNode;
    }

    public static int pop(){
        if (isEmpty()) {
            return -1;
        }
        int top = Node.head.data;
        Node.head = Node.head.next;
        return top;
    }

    public static int peek(){
        if (isEmpty()) {
            return -1;
        }
        int top = Node.head.data;
        return top;
    }

    

}   
        


    public static void main(String[] args) {
        StackA s = new StackA();
        s.push(1);
        s.push(2);
        s.push(3);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
