
import java.util.ArrayList;
import java.util.*;

public class StackB {
    
    // public static class Node{
    //     int data;
    //     Node next;
    //     public Node(int data){
    //         this.data = data;
    //         this.next = null;
    // //     }
    // // }

    // // public static Node head;

    // public static class Stack{
        
    //     public boolean isEmpty() {
    //         if (head == null) {
    //             return true; 
    //         }
    //         return false;
    //     }        

    //     public void push(int data) {
    //         Node newNode = new Node(data);
    //         if(isEmpty()){
    //            head =newNode; 
    //            return;
    //         }
    //         newNode.next= head;
    //         head = newNode;
    //     }

    //     public int pop() {
    //         int top = head.data;
    //         if(isEmpty()){
    //             return -1;
    //         }
    //         head =head.next;
    //         return top;
    //     }

    //     public int peek() {
    //         if(isEmpty()){
    //             return -1;
    //         }
    //         return head.data;
    //     }


        
        
    //     // Implementation using ArrayList
        
    //     // static ArrayList<Integer> list = new ArrayList<>();

    //     // public static boolean isEmpty() {
    //     //     if (list.size()==0) {
    //     //         System.out.println("stack is empty");
    //     //         return true;
    //     //     }
    //     //     return false;

    //     // }

    //     // //push
    //     // public static void push(int data) {
    //     //     list.add(data);
    //     // }
    //     // //pop
    //     // public static int pop() {
    //     //     if (isEmpty()) {
    //     //         System.out.println("stack is empty");
    //     //     }
    //     //     int top = list.get(list.size()-1);
    //     //     list.remove(list.get(list.size()-1));
    //     //     return top;
    //     // }

    //     // public static int peek() {
    //     //     if (isEmpty()) {
    //     //         System.out.println("stack is empty");
    //     //     }
    //     //     return list.get(list.size()-1);
    //     // }
    // }
    
    public static void main(String[] args) {
        // Stack s = new Stack();
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()){
            System.out.println( s.peek())   ;  
            s.pop();
        }
    }
}
