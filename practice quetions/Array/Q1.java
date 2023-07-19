import java.util.HashMap;
import java.util.HashSet;

public class Q1{
    
    public static boolean isRepeating(int arr[]) {
        HashSet<Integer>hm = new HashSet<>();
        for(int i =0;i<arr.length;i++){
            if (hm.contains(arr[i])) {
                return true;
            }else{
                hm.add(arr[i]);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        System.out.println(isRepeating(arr));
    }
}