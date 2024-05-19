import java.util.Stack;


public class Q6 {

    public static void printArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }

    public static void nextGrater(int arr[]){
        Stack<Integer> s = new Stack<>();
        int newGreater1[] = new int[arr.length];

        for (int i = arr.length-1; i >=0 ; i--) {
            while (!s.empty() && arr[s.peek()]<=arr[i]) {
                s.pop();
            }
            if (s.empty()) {
                newGreater1[i] = -1;
            }else{
                newGreater1[i]= arr[s.peek()];
            }
            s.push(i);
        }
        printArr(newGreater1);
    }


    public static void main(String[] args) {
        int arr[]={6,8,0,1,3};
        nextGrater(arr);
    }
}
