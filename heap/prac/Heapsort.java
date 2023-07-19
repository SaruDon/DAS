public class Heapsort{
    
    
    public void heapify(int arr[],int i ,int size) {
        int max = i;
        int leflChild = 2*i+1;
        int rightChild = 2*i+2;
        if(leflChild < size && arr[max] < arr[leflChild]){
            max = leflChild;
        }
        if(rightChild < size && arr[max] < arr[rightChild]){
            max = rightChild;
        }
        if (max != i) {
            int temp = arr[i];
            arr[i]  = arr[max];
            arr[max] = temp;

            heapify(arr, max, size);
        }
    }
    
    
    public void heapsort(int arr[]) {
        
        int n = arr.length;
        for (int i = n/2; i >= 0; i--) {
            heapify(arr, i,n);            
        }

        for (int i = n-1; i >0; i--) {
            //swap
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, 0, i);
        }
    }
    
    public static void main(String[] args) {
        int arr [] = {1,2,4,5,3};
        Heapsort h = new Heapsort();
        h.heapsort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}