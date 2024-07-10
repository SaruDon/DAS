import java.util.*;
public class Nearpt {

    public class Point implements Comparable<Point>{
        int x;
        int y;
        int sqrtDist;
        int index;
        Point(int x, int y, int sqrtDist,int index){
            this.x = x;
            this.y = y;
            this.sqrtDist = sqrtDist;
            this.index = index;
        }

        public int compareTo(Point p2) {
            return this.sqrtDist - p2.sqrtDist;
        }


    }
    public static void main(String[] args) {
        Nearpt q1 = new Nearpt();
        int arr [][] = {{3,3},{5,1},{-2,4}};   
        int k =2;
        

        PriorityQueue<Point> p = new PriorityQueue<>();
        
        for (int i = 0; i < arr.length; i++) {
           int distSqrt = (arr[i][0] * arr[i][0]) + (arr[i][1] * arr[i][1]);

            p.add(q1.new Point(arr[i][0], arr[i][1], distSqrt,i));
        }
        for(int i =0 ;i<k; i++){
            Point point = p.peek();
            System.out.println("c"+point.index);
            p.remove();
        }   
    }
}
