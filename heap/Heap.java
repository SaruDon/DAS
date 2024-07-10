import java.util.ArrayList;

public class Heap {
    ArrayList<Integer> arr = new ArrayList<>();

    public void add(int data) {
        arr.add(data);
        int chid = arr.size()-1;
        int par = (chid-1)/2;
        while (arr.get(chid) < arr.get(par)) {
            int temp = arr.get(chid);
            arr.set(chid,arr.get(par));
            arr.set(par,temp);

            chid =par;
            par= (chid-1)/2;
        }
    }

    public boolean isEmpty() {
        return arr.size()==0;
    }

    public int peek() {
        return arr.get(0);
    }

    public void heapify(int i) {
        int min = i;
        int leflChild = 2*i+1;
        int rightChild = 2*i+2;
        if(leflChild < arr.size() && arr.get(min)> arr.get(leflChild)){
            min = leflChild;
        }
        if(rightChild < arr.size() && arr.get(min)> arr.get(rightChild)){
            min = rightChild;
        }
        if (min != i) {
            int temp = arr.get(min);
            arr.set(min,arr.get(i));
            arr.set(i,temp);

            heapify(min);
        }
    }
    
    

    public int remove() {
        int data = arr.get(0);

        //swap
        int temp = arr.get(0);
        arr.set(0, arr.get(arr.size()-1));
        arr.set(arr.size()-1, temp);

        arr.remove(arr.size()-1);
        heapify(0);
        return data;
    }
    public static void main(String[] args) {
        Heap h = new Heap();
        h.add(1);
        h.add(2);
        h.add(0);
        h.add(6);
        while (!h.isEmpty()) {
            System.out.println(h.peek()+ " ");
            h.remove();
        }
    }
}
