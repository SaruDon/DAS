public class Storedwt {
     
    public static int waterlevel( int arr[]){
        int maxWater = Integer.MIN_VALUE;
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = i+1; j < arr.length; j++) {
        //         int currwater = 0;
        //         int min = Math.min(arr[i], arr[j]);
        //         currwater += min * (j-i);
        //         if (currwater>maxWater) {
        //             maxWater =currwater;
        //         }
        //     }
        // }
        // return maxWater;
        int i =0; 
        int j =arr.length-1;
        while (i<j) {
            int curr =0;
            int min = Math.min(arr[i], arr[j]);
            curr += min*(j-i);
            if (curr>maxWater) {
                maxWater = curr;
            }
            if (arr[i]<arr[j]) {
                    i++;
            }else{
                    j--;
            }
        }
        return maxWater;
    }

    public static void main(String[] args) {
        int arr [] = {1,8,6,2,5,4,8,3,7};
        System.out.println(waterlevel(arr));
    }
}
