public class FibTypeQuetion {
    
    public  static int noOfWayToClimbStairs(int arr[],int n){
        if (n==3) {
            return 4;
        }
        if (n==2 || n== 1) {
            return n;
        }
        if (arr[n]!=0) {
            return arr[n];
        }
        arr[n] = noOfWayToClimbStairs(arr,n-1)+noOfWayToClimbStairs(arr,n-2)+ noOfWayToClimbStairs(arr, n-3);
        return arr[n];
    }
    
    public static int noOfStairsTab(int n){
        int arr[] = new int[n+1];
        arr[1]=1;
        arr[2]=2;
        for (int i = 3; i <=n; i++) {
            arr[i]= arr[i-1]+arr[i-2];
        }
        return arr[n];
    }
    
    public static void main(String[] args) {
        int n = 5;
        int arr[] = new int[n+1];
        System.out.println(noOfWayToClimbStairs(arr,n));
        // System.out.println(noOfStairsTab(n));
    }
}
