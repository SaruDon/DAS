import java.util.Arrays;;
public class inbuiltSort {
    
    public static void printArray(int arr[]) {
        for (int i =0; i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args) {
        int nums [] ={5,4,1,3,2};
        Arrays.sort(nums,0,4);
        printArray(nums);
        }
}
