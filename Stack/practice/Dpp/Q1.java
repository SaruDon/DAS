import java.util.LinkedList;
import java.util.Stack;

public class Q1{


    public static boolean isPalindrome(LinkedList<Character>ll){
        int mid = ll.size()/2;
        Stack<Character>s = new Stack<>();
        for (int i = 0; i < mid; i++) {
            s.add(ll.get(i));
        }
        if (ll.size()%2!=0) {
            mid = mid+1;
        }
        for (int i = mid; i < ll.size(); i++) {
            if (s.peek()!=ll.get(i)) {
                return false;
            }
            s.pop();
        }
        return true;
    }

    public static void main(String[] args) {
        LinkedList<Character>ll = new LinkedList<>();
        ll.add('A');
        ll.add('B');
        ll.add('C');
        ll.add('B');
        ll.add('A');
        System.out.println(isPalindrome(ll));
    }
}