public class Q2 {
    
    public static int nextNo(int arr[]){
        for(int i =1; i<arr.length;i++){
            //AP
            if(arr[i+1]==arr[i-1]+arr[i] && i<=3){
                if (i==3) {
                    return nextFib(arr);
                }
            }            
            else if (arr[i]-arr[i-1]==arr[i+2]-arr[i+1] && i<=2) {
                if(i==2){
                    return nextAP(arr);
                }
            }
            else if (arr[i]/arr[i-1]==arr[i+2]/arr[i+1] && i<=2) {
                if (i==2) {
                    return nextGP(arr);
                }
            }          
        }
        return -1;
    }


    public static int nextAP(int arr[]){
        return arr[arr.length-1]+ (arr[1]-arr[0]);
    }
    public static int nextGP(int arr[]){
        return (arr[1]/arr[0])*arr[arr.length-1];
    }
    public static int nextFib(int arr[]){
        return arr[arr.length-1]+arr[arr.length-2];
    }
    
    public static void main(String[] args) {
        int arr[] ={3,7,11,15,19};
        // int arr[] ={2,4,8,16,32};
        // int arr[] ={1,1,2,3,5};
        System.out.print(nextNo(arr));
    }
}
