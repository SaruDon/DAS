import java.util.HashSet;
public class Q3 {
    
    public static void union(int arr1[],int arr2[]) {
        HashSet<Integer> hs = new HashSet<>();
        for( int i=0; i<arr1.length;i++){
            hs.add(arr1[i]);
        }
        for( int i=0; i<arr2.length;i++){
            hs.add(arr2[i]);
        }
        System.out.println("Union is:"+hs);

        for (int i = 0; i < arr2.length; i++) {
            hs.add(arr1[i]);
        }
        hs.clear();
        for (int i = 0; i < arr1.length; i++) {
            hs.add(arr1[i]);
        }
        int count =0;
        for (int i = 0; i < arr2.length; i++) {
            
        }
    }
    
    public static void main(String[] args) {
        int arr1[]= {7,3,9};
        int arr2[] ={6,3,9,2,9,4};
        union(arr1,arr2);
    }
}
