package QueueA;

import java.util.LinkedList;

public class QueueL {
    static LinkedList<Integer> l =new LinkedList<>();
    
    public static boolean isEmpty(){
        return l.isEmpty();
    }


    public static void add(int data){
        l.addLast(data);
    }
    public static int remove(){
        int val= l.getFirst();
        l.removeFirst();
        return val;
    }
    public static int peek(){
        int val= l.getFirst();
        return val;
    }

}
