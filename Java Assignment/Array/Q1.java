public class Q1{
    
    //print false if all distinct else ture
    public static boolean distinct(int arr[]){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max= Math.max(max,arr[i]);
        }
        int count [] = new int[max+1];
        for (int i = 0; i < arr.length; i++) {
            if (count[arr[i]]>=0) {
                count[arr[i]]++;
            }
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i]>1) {
                return true;
            }
        }
        return false;
    }


    public static int roatindx(int arr[],int lp,int rp,int key){
        int n = arr.length;
        int mid = lp+(rp-lp)/2;
        while (lp!=rp) {
            if (arr[mid]==key) {
                return mid;
            }
            if (arr[mid]>key) {
                rp=(n+rp-1)%n;
            }else{
                lp=(lp+1)%n;
            }
        }
        return -1;
    }

    public static int searchInSortedAndRotated(int arr[], int target){
        int br =0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1]>arr[i]) {
                br=i;
                break;
            }
        }
        int lp = br;
        int rp = br-1;
        // while (lp!=rp) {
        //     if
        // }
        return roatindx(arr,lp,rp,target);
    }



    //sorted and rotated search
    public static int roatsearch(int nums[], int si, int ei,int key){
        int mid = si+(ei-si)/2;
        if(key == nums[mid]){
            return mid;
        }
        if(si==ei){
            return -1;
        }
        if(nums[si]<nums[mid]){  //1stline
            if(nums[si]<=key && key<=nums[mid]){
               return roatsearch(nums,si,mid-1,key);
            }else{
               return roatsearch(nums,mid+1,ei,key);
            }
        }else{
            if(key>=nums[mid] && key<=nums[ei]){
               return roatsearch(nums,mid+1,ei,key);
            }else{
              return roatsearch(nums,si,mid-1,key);
            }
        }
    }
    public static int search(int[] nums, int target) {
        int si =0;
        int ei = nums.length-1;
        return roatsearch(nums,si,ei,target);
    }



    //rain water trap
    public int trap(int[] arr) {
        int lm [] = new int[arr.length];
        lm[0]=arr[0];
        for(int i =1; i<arr.length;i++){
            lm[i]=Math.max(lm[i-1],arr[i]);
        }
        
        int n = arr.length-1;
        int rm [] = new int[arr.length];
        rm[n]=arr[n];
        for(int i =n-1; i>=0;i--){
            rm[i]=Math.max(rm[i+1],arr[i]);
        }

    
        int maxwater=0;
        for(int i =0; i<arr.length;i++){
            int currWater=0;
            currWater = Math.min(lm[i],rm[i]) - arr[i];
            if(currWater<0){
                currWater=0;
            }
            maxwater+=currWater;
        }
        return maxwater;
    }

    
    
    public static void main(String arg[]){
        // int arr[]={1,2,3,5};
        // System.out.println(distinct(arr));
        int []nums = {1};int  target = 3;


        // System.out.println(searchInSortedAndRotated(arr, target));
        System.out.println(search(nums,7));
    }
}