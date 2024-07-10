package QueueA;

public class QueueArr {
    public static int arr[];
    public static int size;
    public static int rear;
    public QueueArr(int n){
        arr =new int[n];
        size=n;
        rear =-1;
    }
    public static boolean isEmpty(){
        return (rear==-1);
    }

    public static boolean isFull(){
        return rear==size-1;
    }

    public static void add(int data){
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        rear++;
        arr[rear]=data;
    }

    public static int remove(){
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int data = arr[0];
        for (int i = 0; i < rear; i++) {
            arr[i]=arr[i+1];
        }
        rear--;
        return data;
    }

        public static int peek(){
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int front = arr[0];
        return front;
    }
}
