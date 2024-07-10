import java.util.PriorityQueue;

public class Main{
   

    public static class Students implements Comparable<Students>{
        String name;
        int rank;
        Students(String name,int rank){
            this.name = name;
            this.rank = rank;
        }
        @Override
        public int compareTo(Students s2){
            return this.rank-s2.rank;
        }
    }
    
    
    
    
    
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(3);
        pq.add(1);
        pq.add(2);
        pq.add(100);
        pq.add(70);
        while (!pq.isEmpty()) {
            System.out.println(pq.peek());
            pq.remove();
        }


        PriorityQueue<Students>pq = new PriorityQueue<>();
        pq.add(new Students("S", 4));
        pq.add(new Students("L", 1));
        pq.add(new Students("J", 5));
        pq.add(new Students("M", 2));
        while (!pq.isEmpty()) {
            System.out.println(pq.peek().rank);
            pq.remove();
        }

    }
}