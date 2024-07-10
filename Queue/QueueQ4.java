import java.util.*;

public class QueueQ4 {
    

    public static void nonRepeating(String str) {
        int feq[]= new int[26];
        Queue<Character> q= new LinkedList<>();


        for (int i = 0; i < str.length(); i++) {
            char ch =str.charAt(i);
            q.add(ch);
            feq[ch-'a']++;
            while (!q.isEmpty() && feq[ch-'a']>1) {
                q.remove();
            }
            if (q.isEmpty()) {
                System.out.print(-1+" ");
            }
            else{
                System.out.print(q.peek()+" ");
            }

        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        String str = "aabcxb";
        nonRepeating(str);
    }
}
