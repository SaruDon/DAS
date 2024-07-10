import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        int arr[] ={1,3,2,5,1,3,1,5,1};
        TreeMap<Integer,Integer> tm = new TreeMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (tm.containsKey(arr[i])) {
                tm.put(arr[i],tm.get(arr[i])+1);
            }else{
                tm.put(arr[i],1);
            }
        }
        
        int k = arr.length/3;
        Set<Integer> keySet = tm.keySet();
        for (Integer key : keySet) {
            if (tm.get(key)>k) {
                System.out.println(key);
            }
        }
}
}