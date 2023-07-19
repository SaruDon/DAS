import java.util.PriorityQueue;

public class Q3 {
    
    public class Row implements Comparable<Row> {
        int soldiers;
        int indx;

        public Row(int soldiers, int indx) {
            this.soldiers = soldiers;
            this.indx = indx;
        }

        @Override
        public int compareTo(Row r2) {
            if (this.soldiers == r2.soldiers) {
                return this.indx - r2.indx;
            } else {
                return this.soldiers - r2.soldiers;
            }
        }
    }
    
    public static void main(String[] args) {
        int arr[][] = {
            {1, 0, 0, 0},
            {1, 1, 1, 1},
            {1, 0, 0, 0},
            {1, 0, 0, 0}
        };
        int k = 2;

        Q3 q = new Q3();
        PriorityQueue<Row> pq = new PriorityQueue<>();
        
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr[i].length; j++) {
                count += arr[i][j] == 1 ? 1 : 0;
            }
            pq.add(q.new Row(count, i));
        }
        
        for (int i = 0; i < k; i++) {
            System.out.println("R" + pq.remove().indx);
        }
    }
}
