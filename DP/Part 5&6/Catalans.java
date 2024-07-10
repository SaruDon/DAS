
import java.util.Arrays;

public class Catalans {

    private static int catalans(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += catalans(i) * catalans(n - i - 1);
        }
        return ans;
    }

    private static int catalansDpMemo(int n, int dp[]) {
        if (n == 1 || n == 0) {
            return 1;
        }
        if (dp[n] != -1) {
            return dp[n];
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += catalansDpMemo(i, dp) * catalansDpMemo(n - i - 1, dp);
        }
        dp[n] = ans;
        return dp[n];
    }

    private static int catalansDptab(int n) {
        int dp[] = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i < dp.length; i++) {
            int ans = 0;
            for (int j = 0; j < i; j++) {
                ans += dp[j] * dp[i - j - 1];
            }
            dp[i] = ans;
        }
        return dp[n];
    }

    public static int mcmRec(int arr[], int i, int j) {
        if (i == j) {
            return 0;
        }
        int ans = Integer.MAX_VALUE;
        for (int k = i; k <= j - 1; k++) {
            int cost1 = mcmRec(arr, i, k);
            int cost2 = mcmRec(arr, k + 1, j);
            int cost3 = arr[i - 1] * arr[k] * arr[j];
            int finalCost = cost1 + cost2 + cost3;
            ans = Math.min(ans, finalCost);
        }
        return ans;
    }

    public static int mcmMemo(int arr[], int dp[][], int i, int j) {
        if (i == j) {
            return 0;
        }
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        int ans = Integer.MAX_VALUE;
        for (int k = i; k <= j - 1; k++) {
            int cost1 = mcmMemo(arr, dp, i, k);
            int cost2 = mcmMemo(arr, dp, k + 1, j);
            int cost3 = arr[i - 1] * arr[k] * arr[j];
            int finalCost = cost1 + cost2 + cost3;
            ans = Math.min(ans, finalCost);
            dp[i][j] = ans;
        }
        return dp[i][j];
    }

    public static int mcmTabulation(int arr[]) {
        int dp[][] = new int[arr.length + 1][arr.length + 1];
        for (int k = 0; k < dp.length; k++) {
            for (int k2 = 0; k2 < dp.length; k2++) {
                if (k == k2) {
                    dp[k][k2] = 0;
                }
            }
        }

        for (int length = 2; length < dp.length; length++) {
            for (int i = 1; i < dp.length - length; i++) {
                int j = i + length - 1;
                dp[i][j] = Integer.MAX_VALUE;
                for (int k = i; k <= j - 1; k++) {
                    int cost1 = dp[i][k];
                    int cost2 = dp[k + 1][j];
                    int cost3 = arr[i - 1] * arr[k] * arr[j];
                    dp[i][j] = Math.min(dp[i][j], cost1 + cost2 + cost3);
                }
            }
        }
        return dp[1][arr.length - 1];
    }

    public static int minDiff(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int W = sum / 2;
        int dp[][] = new int[arr.length + 1][W + 1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if (i == 0 | j == 0) {
                    dp[i][j] = 0;
                }
            }
        }
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (arr[i - 1] <= j) {
                    int ans1 = arr[i - 1] + dp[i - 1][j - arr[i - 1]];
                    int ans2 = dp[i - 1][j];
                    dp[i][j] = Math.max(ans1, ans2);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        int sum1 = dp[arr.length][W];
        int sum2 = sum - sum1;
        return Math.abs(sum1 - sum2);
    }

    public static int minJumps(int arr[]) {
        int dp[] = new int[arr.length];
        Arrays.fill(dp, -1);
        dp[arr.length - 1] = 0;
        for (int i = arr.length - 2; i >= 0; i--) {
            int steps = arr[i];
            int ans = Integer.MAX_VALUE;
            for (int j = i + 1; j <= i + steps && j < arr.length; j++) {
                if (dp[j] != -1) {
                    ans = Math.min(ans, dp[j] + 1);
                }
            }
            if (ans != Integer.MAX_VALUE) {
                dp[i] = ans;
            }
        }
        return dp[0];
    }

    public static void main(String[] args) {
        // int n =4;
        // int dp [] = new int[n+1];
        // dp[0]=1;
        // dp[1]=1;
        // Arrays.fill(dp, -1);
        // System.out.println(catalans(n));    
        // System.out.println(catalansDpMemo(n, dp));

        // int arr[] = {1, 2, 3, 4, 3};
        // int dp[][] = new int[arr.length + 1][arr.length + 1];
        // for (int[] row : dp) {
        //     Arrays.fill(row, -1);
        // }
        // System.out.println(catalansDptab(n));
        // System.out.println(mcmRec(arr, 1, arr.length - 1));
        // System.out.println(mcmMemo(arr, dp, 1, arr.length - 1));
        // System.out.println(mcmTabulation(arr));
        // int arr[] = {1, 6, 11, 5};
        // System.out.println(minDiff(arr));
        int arr[] = {2, 3, 1, 1, 4};

        System.out.println(minJumps(arr));

    }

}
