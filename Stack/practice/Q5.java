import java.util.Stack;

public class Q5 {
    //brute force

    public static void printArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }

    public static void stockSpan(int arr[]){
        int span[] = new int [arr.length];
        span[0]=1;
        Stack<Integer>s = new Stack<>();
        s.push(0);
        for (int i = 0; i < arr.length-1; i++) {
                while (arr[i+1]>arr[s.peek()] && !s.empty()) {
                    s.pop();
                }
                if (s.empty()) {
                    span[i+1]= i+2;
                }else{
                    span[i+1]= i+1 - s.peek();
                }
            s.push(i+1);
        }
        printArr(span);
    }


    public static void main(String[] args) {
        int arr[] ={100,80,60,70,60,85,100};
        stockSpan(arr);
}
}