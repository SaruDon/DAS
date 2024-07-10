public class Heapsort {
    
    
    public static void heapify(int arr[], int i, int size) {
        int leftChild = 2*i+1;
        int rightChild = 2*i+2;
        int max = i;


        if (leftChild < size && arr[leftChild] > arr[max]) {
            max = leftChild;
        }
        if (rightChild < size && arr[rightChild] > arr[max]) {
            max = rightChild;
        }
        if (max != i) {
            int temp = arr[i]; 
            arr[i] = arr[ max];
            arr[ max] = temp;

            heapify(arr,max,size);
        }
    }


    public static void heapSort(int arr[]) {
        int n = arr.length;
        //maxHeap
        for (int i = n/2; i >= 0; i--) {
            heapify(arr,i,n);
        }
        //sort


        for (int i = n-1; i > 0; i--) {
            int temp = arr[0];
            arr[0]= arr[i];
            arr[i] = temp;
            heapify(arr,0,i);
        }
        
    }
    
    public static void main(String[] args) {
        int arr[]  ={1,2,4,5,3};
        heapSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
