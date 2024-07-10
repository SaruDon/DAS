public class searchKey {

    public static int firstoccarance(int arr[],int key, int i) {
        if( i == arr.length-1){
            return -1;
        }
        
        if(arr[i]==key){
            return i;
        }
         return firstoccarance(arr, key, i+1);
    }

    public static int lastOccarance(int arr[],int key ,int i) {
        if( i == 0){
            return -1;
        }
        
        if(arr[i]==key){
            return i;
        }    
        return firstoccarance(arr, key, i-1);
    }
    public static void main(String[] args) {
        int arr [] ={8,3,6,9,5,10,2,5,3};
        System.out.println(firstoccarance(arr, 5, 0));
        System.out.println(lastOccarance(arr, 5, arr.length-1));
    }
}
