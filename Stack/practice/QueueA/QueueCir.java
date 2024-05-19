package QueueA;

public class QueueCir {
    public static int arr[];
    static int size;
    static int rear;
    static int front;
    public QueueCir(int n){
        arr =new int [n];
        size = n;
        front=-1;
        rear=-1;
    }

    public static boolean isEmpty(){
        return (rear==-1)&&(front==-1);
    }

    public static boolean isFull(){
        return ((rear+1)%size)==front;
    }

    public static void add(int data){
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        if (front==-1) {
            front=0;
        }
        rear = (rear+1)%size;
        arr[rear]=data;
    }

    public static int remove(){
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int data = arr[front];
        if (front==rear) {
            front=rear=-1;
        }else{
            front= (front+1)%size;
        }
        return data;
    }

    public static int peek(){
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int data = arr[front];
        return data;
    }
}
