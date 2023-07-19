public class Insertion {


    public static void printArayy(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }

    public static void insertion( int arr[]){
        for (int i = 0; i < arr.length; i++) {
            int curr=arr[i];
            int prev = i-1;
            while (prev>=0 && arr[prev]>curr) {
                arr[prev]=arr[prev+1];
                prev--;
            }
            arr[prev+1]= curr;
            printArayy(arr);
        }
    }
    public static void main(String[] args) {
        int arr[]={5,3,2,6,1};
        insertion(arr);
        printArayy(arr);
    }
}
