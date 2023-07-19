import java.util.PriorityQueue;

public class Q2 {
    public static void main(String[] args) {
        int arr[]={2,3,3,4,6};
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            q.add(arr[i]);
        }
        int cost =0;
        while (q.size()>1) {
            int min= q.remove();
            int min2= q.remove();
            cost += min2+ min;
            q.add(min+min2);
        }
        System.out.println(cost);    
    }
}
