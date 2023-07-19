

public class Array {

    public static void arrayBack(int arr[],int i,int val) {
        if(i==arr.length){    // terminating condition
            printArray(arr);
            return;
        }
        //kam
        arr[i]=val;
        arrayBack(arr, i+1, val+1);
        // backtract
        arr[i] =arr[i]- 2; 
    }

    public static void printArray(int arr[]) {
        for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = new int [5];
        arrayBack(arr,0,1);
        System.out.println();
        printArray(arr);
    }
}
