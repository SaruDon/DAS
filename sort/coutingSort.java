<<<<<<< HEAD
public class coutingSort {

    public static void countSort(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i=0 ;i< arr.length;i++){
            largest = Math.max(largest, arr[i]);
        }
        int count[] =new int [largest+1];
        for( int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int j=0;
        for( int i=0;i<count.length;i++){
            while( count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
          }
    }
    public static void main(String[] args) {
        int arr[] ={1,4,1,3,2,4,3,7};
        countSort(arr);
    }
}
=======
public class coutingSort {

    public static void countSort(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i=0 ;i< arr.length;i++){
            largest = Math.max(largest, arr[i]);
        }
        int count[] =new int [largest+1];
        for( int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int j=0;
        for( int i=0;i<count.length;i++){
            while( count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
          }
    }
    public static void main(String[] args) {
        int arr[] ={1,4,1,3,2,4,3,7};
        countSort(arr);
    }
}
>>>>>>> 5f7b76f325310b072c0710ea99305cfd482d2e1f
