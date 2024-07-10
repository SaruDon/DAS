public class Q1{
    


    public static int eat(int arr[],int rat,int unit){
        int sum =arr[0];
        if (arr.length==0) {
            return -1;
        }
        for (int i = 1; i < arr.length; i++) {
            sum+=arr[i];
            if (sum > (rat*unit)){
                return arr.length-i-1;
            }
        }
        return 0;
    }
    
    
    public static void main(String[] args) {
        int arr[] ={2 ,8, 3, 5, 7 ,4, 1, 2};
        int rat =7;
        int unit=2;
        System.out.println(eat(arr, rat, unit));
    }
}