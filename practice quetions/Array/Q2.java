import java.util.ArrayList;

public class Q2 {

    public static void main(String[] args) {
        int arr[]= {1,4,1,3,2,4,3,7};
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        int count [] = new int [max+1];
        for (int i = 0; i < count.length; i++) {
            count[arr[i]]++;
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i]!=0) {
                System.out.print(i);
                count[i]--;
            }
        }
    }
}
