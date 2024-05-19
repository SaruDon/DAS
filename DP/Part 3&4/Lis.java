import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Lis {
 
    public static int lis(int arr[]){
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            hs.add(arr[i]);
        }
        int[] copy = new int[hs.size()];
        int j=0;
        for (int i : hs) {
            copy[j++] = i; 
        }
        Arrays.sort(copy);
        return lcs(arr,copy);
    }
    
 
    private static int lcs(int[] arr, int[] copy) {
        int n = arr.length;
        int m = copy.length;
        int dp[][]= new int[n+1][m+1];
        for (int i = 0; i < dp.length; i++) {
           dp[i][0] =0;
        }
        for (int i = 0; i < dp[0].length; i++) {
            dp[0][i] =0;
        }
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (arr[i-1]==copy[j-1]) {
                    dp[i][j] = dp[i-1][j-1] +1;
                }else{
                    int ans1 = dp[i-1][j];
                    int ans2 = dp[i][j-1];
                    dp[i][j]= Math.max(ans1, ans2);
                }
            }
        }
        return dp[n][m];
    }


    public static void main(String[] args) {
        int arr1[] ={50,3,10,7,40,80};
        System.out.println(lis(arr1));
    }
}
