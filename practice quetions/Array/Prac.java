public class Prac{
    
    public static void bubbleSort(int arr[]){
        int n = arr.length;
        for(int i =0; i<n; i++){
            for(int j =1; j<n-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp= arr[j-1];
                    arr[j-1]= arr[j];
                    arr[j]= temp;
                }
            }
        }
        printArray(arr);
    }
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
    }
    

    public static void selectionSort(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            int minPos = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minPos]>arr[j]){
                    minPos = arr[j];
                }
            }
            int temp = arr[minPos];
            arr[minPos]=arr[i];
            arr[i]= temp;
        }
        printArray(arr);
    }


    public static void insertionSort( int arr[]){
        for(int i =1 ; i<arr.length;i++){
            int curr= arr[i];
             int prev = i-1;
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]= arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
        printArray(arr);
    }

    public static void countingSort(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i =0; i<arr.length;i++){
            if(arr[i]>max){
                max= arr[i];
            }
        }
        int count[] = new int [max+1];
        for(int i =0;i<arr.length;i++){
            count[arr[i]]++;
        }
    
        for(int i =0, j=0; i<count.length;i++){
            while(count[i]!=0){
                arr[j]= i;
                j++;
                count[i]--;
            }
        }
        printArray(arr);
    }
    
    public static int searchInRoatated(int arr[], int key,int si,int ei){
        int mid = si +(ei-si)/2;
        if (arr[mid]== key) {
            return mid;
        }
        if(arr[mid]>arr[si]){
            if (key<=arr[mid] && key>=arr[si]) {
              return  searchInRoatated(arr, key, si, mid);
            }else{
              return  searchInRoatated(arr, key, mid+1, ei);
            }
        }else{
            if (key>=arr[mid] && key<=arr[ei]) {
                return searchInRoatated(arr,key,mid+1,ei);
            }else{
                return searchInRoatated(arr,key,si,mid-1);
            }
        }
    }


    public static int stock(int prices[]){
        int buyPrice= prices[0];
        int Maxprofit =0;
        for (int i = 1; i < prices.length; i++) {
            int currProfit =0;
            if(buyPrice>prices[i]){
                buyPrice = prices[i];
            }
            currProfit = prices[i]-buyPrice;
            Maxprofit = Math.max(Maxprofit, currProfit);
        }
        return Maxprofit;
    }


    public static void main(String arg[]){
        int arr[] ={5,4,3,2,1,1,4,4};
        int nums [] = {4, 5, 6, 7, 0, 1, 2};
        int prices[] =    {7, 6, 4, 3, 1};
        // bubbleSort(arr);
        // selectionSort(arr);
        // insertionSort(arr);
        // countingSort(arr);
        // System.out.print(searchInRoatated(nums,0,0,arr.length-1));
        System.out.println(stock(prices));
    }
}