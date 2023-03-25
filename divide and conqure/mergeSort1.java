

public class mergeSort1 {

    public static void pirntArray( int arr[]){
        for( int i=0; i<arr.length;i++){
            System.out.println(arr[i]+"");
        }
        System.out.println();
    }

    public static void mergegola(int arr[],int si,int ei) {
        if(si>=ei){
            return;
        }
        int mid = si+(ei-si)/2; //can be written as (si+ei)/2
        mergegola(arr, si, mid);
        mergegola(arr, mid+1, ei);
        mergesub(arr,si,mid,ei);
    }
    public static void mergesub(int arr[],int si, int mid, int ei) {
        int temp [] = new int [ei-si+1];
        int i = si; //iterator for left part
        int j = mid+1; //iterator for right part
        int k =0; //iterator for temp arr 

        while(i<= mid && j<=ei){
            if(arr[i] <arr[j]){
                temp[k] =arr[i]; 
                i++;
                k++;
            }else{
                temp[k]=arr[j];
                k++;
                j++;
            }
        }
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=ei){
            temp[k++]=arr[j++];
        }

        for(k=0,i=si; k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
    }
    public static void main(String[] args) {
        int arr[] ={6,3,9,5,2,8};   
        mergegola(arr, 0, arr.length-1);
        pirntArray(arr);
    }
}
