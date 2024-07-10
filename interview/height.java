public class height {
    public static void printArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }


    static int getMinDiff(int[] arr, int n, int k) {
        int arrInc[] =  new int [n];
        for(int i =0; i<n; i++){
            arrInc[i] =arr[i] + k; 
        }
       
        int arrDec[] =  new int [n];
        for(int i =0; i<n; i++){
            arrDec[i] = arr[i] - k; 
        }
        
        arr[0]= Math.max(arrInc[0],arrDec[0]);    
        
        for(int i=1; i<n ;i++){
            int sum1 = Math.abs(arr[0]-arrInc[i]);
            int sum2 = Math.abs(arr[0]-arrDec[i]);
                if(sum1>sum2 && arrDec[i]>0){
                    arr[i]=arrDec[i];
                }else{
                    arr[i]=arrInc[i];
                }
        }
        printArr(arr);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(int i=0; i<n;i++){
            if(arr[i]>max){
                max= arr[i];
            }
        }
        
        for(int i=0; i<n;i++){
            if(arr[i]<min){
                min= arr[i];
            }
        }
        System.out.println();
        System.out.println("max is"+max);
        System.out.println(min);
        
        System.out.println("?");
        return max-min;
    }
    public static void main(String[] args) {
        int arr[]={1, 9, 10, 1 ,1 ,3 ,10, 3, 4, 6};
        System.out.println(getMinDiff(arr,arr.length,4));
    }
}
