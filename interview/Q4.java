public class Q4 {
 
 
 
    public static int maxWater(int arr[],int si,int ei){
        int maxWater = Integer.MIN_VALUE;
        // for(int i=0;i<arr.length;i++){
        //     for(int j=i+1;j<arr.length;j++){
        //         int curr=0;
        //         int min = Math.min(arr[i],arr[j]);
        //         curr = min * (j-i);
        //         if(curr>maxWater){
        //             maxWater= curr;
        //         }
        //     }
        // }
        // return maxWater;

        while(si<ei){
            int curr =0;
            int min = Math.min(arr[si],arr[ei]);
            curr = min * (ei-si);
            if(curr>maxWater){
                maxWater= curr;
                si++;
            }else{
                ei--;
            }
        }
        return maxWater;
    }
 
 
    public static void main(String[] args) {
        int arr[] ={1,8,6,2,5,4,8,3,7};
        System.out.print(maxWater(arr, 0, arr.length-1));
    }
}
