import java.util.Arrays;

public class Q2 {
    
    public static int minCost(int arr[]){
        Arrays.sort(arr);
        int ansSum[]  = new int[arr.length];
        int cost =arr[1]+arr[0];
        ansSum[0]=cost;
        int sum=0;
        for(int i =2; i<arr.length;i++){
            sum = cost+arr[i];
            ansSum[i]=sum;
            cost=sum;
        }
        int ansCost=0;
        for (int i = 0; i < ansSum.length; i++) {
            ansCost +=ansSum[i];
        }
        return ansCost;
    }
    
    public static void main(String[] args) {
        int arr[]= {1,2,3};
        System.out.println(minCost(arr));    
    }
}
