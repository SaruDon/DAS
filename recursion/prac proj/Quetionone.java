public class Quetionone{
    
    public static void occ(int arr[],int i,int key) {
        // base case
        if(i== arr.length){
            return;
        }
        //
        if(arr[i]== key){
            System.out.print(i +" ");
        }
        occ(arr, i+1, key);
    }
    
    public static void main(String[] args) {
        int arr[] ={3, 2, 4, 5, 6, 2, 7, 2, 2};
        int key =2;
        occ(arr,0, key);
    }
}