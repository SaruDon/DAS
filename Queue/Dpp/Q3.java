import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Q3 {
    
    public static ArrayList<Integer> maxOfSubArray(int arr[], int k){
        ArrayList<Integer>ans = new ArrayList<>();
        Deque<Integer>q =new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            q.add(arr[i]);
        }
        while (!q.isEmpty()) {
            int maxOfSubArr = Integer.MIN_VALUE;
            for (int i = 0; i < k; i++) {
                if (maxOfSubArr<q.peek()) {
                    maxOfSubArr = q.peek();
                }
                q.remove();
            }
            ans.add(maxOfSubArr);
        }
        return ans;
    }
    
    
    public static void main(String[] args) {
        int arr[]= {1,2,3,1,4,5,2,3,6};
        System.out.println(maxOfSubArray(arr, 3));
    }
}
