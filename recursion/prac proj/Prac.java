public class Prac {

    
    public static void print(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    public static void mergeSort(int arr[] ,int si ,int ei){
        if (si>=ei) {
            return;
        }
        int mid = si+(ei-si)/2;
        mergeSort(arr,si,mid);
        mergeSort(arr, mid+1, ei);
        sort(arr,si,mid,ei);
    }

    public static void sort(int arr[],int si , int mid ,int ei){
        int temp [] = new int[ei-si+1];
        int i = si;
        int j = mid+1;
        int k =0;
        while (i<=mid && j<=ei) {
            if (arr[i]< arr[j]) {
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i<=mid) {
            temp[k++] = arr[i++];
        }
        while ( j<=ei) {
            temp[k++] = arr[j++];
        }
        for (k = 0,i=si; k < temp.length; k++,i++) {
            arr[i]= temp[k];
        }
    }


    public static int partition(int arr[], int si, int ei){
        int pivot = arr[ei];
        int i = si-1;
        for( int j = si; j<=ei;j++){
            if (arr[j]<pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j]= temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei]= arr[i];
        arr[i]=temp;
        return i;
    }

    public static void quickSort(int arr[], int si, int ei){
        if (si>=ei) {
            return;
        }
        int pidx = partition(arr, si ,ei);
        quickSort(arr, si, pidx-1);
        quickSort(arr, pidx+1, ei);
    }

    
    public static int searchInSorted(int arr[],int si,int ei ,int target){
        if (si>ei) {
            return -1;
        }

        int mid = si+ (ei-si)/2;
        if (arr[mid] == target) {
            return mid;
        }

        //lies l1 on line one 
        if (arr[si]<=arr[mid]) {
            if (arr[si]<=target && target<=arr[mid]) {
                return searchInSorted(arr, si, mid-1, target);
            }else{
                return searchInSorted(arr, mid+1, ei, target);
            }
        }
        
        //lies on l2
        else{
            if (arr[mid]<=target &&  target<=arr[ei]) {
                return searchInSorted(arr, mid+1, ei, target);
            }else{
                return searchInSorted(arr, si, mid-1, target);
            }
        }


    }

    // public static void mergesort(String arr[], int si, int ei){


    //     int mid = si+(ei-si)/2;
    //     mergesort(arr,si,mid);
    //     mergesort(arr, mid+1, ei);
    //     sorT(arr,si,mid,ei);
    // }
    

    public static void pritnMatrix(char ch[][]){
        for (int i = 0; i < ch.length; i++) {
            for (int j = 0; j < ch.length; j++) {
                System.out.print(ch[i][j]);
            }
            System.out.println();
        }
        System.out.println("__________");
    }

    public static boolean isSafe(char ch [][], int row, int col){
        for (int i = row; i >= 0; i--) {
            if (ch [i][col]=='Q') {
                return false;
            }
        }

        for (int i = row-1,j =col-1; i >= 0 && j>=0; i--,j--) {
            if (row>=0 && col>=0 && ch[i][j]=='Q') {
                return false;
            }
        }

        for (int i = row-1,j=col+1; i>=0 && j< ch.length; i--,j++) {
            if (row>=0 && col<ch.length && ch[i][j]=='Q') {
                return false;
            }
        }
        return true;
        
        
    }

    public static void nQueens(char ch [][],int row){
    if (row == ch.length) {
        pritnMatrix(ch);
        return;
    }
    for (int i = 0; i < ch.length; i++) {

        if(isSafe(ch,row,i)){
        ch [row][i] ='Q';
        nQueens(ch, row+1);
        ch[row][i] ='X';
        }
    }    
    }

    public static void main(String[] args) {
        // int arr[] ={3,7,4,9,2,4,1};
        // mergeSort(arr,0,arr.length-1);
        // quickSort(arr, 0, arr.length-1);
        // print(arr);
        // int arr[] ={4,5,6,7,0,1,2};
        // System.out.println(searchInSorted(arr, 0, arr.length-1, 0));
        String arr [] ={"sun","earth","mars","mercury"};
        char ch [][] = new char[4][4];
        for (int i = 0; i < ch.length; i++) {
            for (int j = 0; j < ch[0].length; j++) {
                ch[i][j]='X';
            }
        }
        nQueens(ch, 0);
    }
}
