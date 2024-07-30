
import java.util.HashMap;

public class FreqNo {
    //Q)29

    public static int freqNo(int arr[], int key) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == key) {
                map.put(arr[i + 1], map.getOrDefault(arr[i + 1], 0) + 1);
            }
        }
        int maxFreq = 0;
        int maxNo = 0;
        for (int i = 0; i < arr.length; i++) {
            if (map.get(arr[i]) == null) {
                continue;
            }
            if (map.get(arr[i]) > maxFreq) {
                maxFreq = map.get(arr[i]);
                maxNo = arr[i];
            }
        }
        return maxNo;
    }

    public static void main(String[] args) {
        int arr[] = {2, 2, 2, 2, 3};
        System.out.println(freqNo(arr, 2));
    }
}
