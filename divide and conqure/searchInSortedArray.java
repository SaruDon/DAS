<<<<<<< HEAD

public class searchInSortedArray {
    
    public static int index(int arr[],int target,int si,int ei) {
        //base case
        if(si>ei){
            return -1;
        }

        //kam
        int mid = si+(ei-si)/2;
        if(arr[mid]==target){
            return mid;
        }

        //mid on L1
        if(arr[si]<=arr[mid]){
            //case a: left
            if(arr[si]<= target && target<=arr[mid]){
                return index(arr, target, si, mid-1);
            }
            else{
                return index(arr, target, mid+1, ei);
            }
        }
        else{
            if(arr[mid]<= target && target<=arr[ei]){
                return index(arr, target, mid+1, ei);
            }
            else{
                return index(arr, target, si, mid-1);
            }
        }
    }
    
    public static void main(String[] args) {
        int arr[] ={4,5,6,7,0,1,2,3};
        int target =0;
        System.out.println(index(arr, target, 0, arr.length-1));
    }
}
=======

public class searchInSortedArray {
    
    public static int index(int arr[],int target,int si,int ei) {
        //base case
        if(si>ei){
            return -1;
        }

        //kam
        int mid = si+(ei-si)/2;
        if(arr[mid]==target){
            return mid;
        }

        //mid on L1
        if(arr[si]<=arr[mid]){
            //case a: left
            if(arr[si]<= target && target<=arr[mid]){
                return index(arr, target, si, mid-1);
            }
            else{
                return index(arr, target, mid+1, ei);
            }
        }
        else{
            if(arr[mid]<= target && target<=arr[ei]){
                return index(arr, target, mid+1, ei);
            }
            else{
                return index(arr, target, si, mid-1);
            }
        }
    }
    
    public static void main(String[] args) {
        int arr[] ={4,5,6,7,0,1,2,3};
        int target =0;
        System.out.println(index(arr, target, 0, arr.length-1));
    }
}
>>>>>>> 5f7b76f325310b072c0710ea99305cfd482d2e1f
