import java.util.PriorityQueue;

public class Q1 {

    class Points implements Comparable<Points> {
        int x;
        int y;
        int distSqrt;

        Points(int x, int y, int distSqrt) {
            this.x = x;
            this.y = y;
            this.distSqrt = distSqrt;
        }

        @Override
        public int compareTo(Points p2) {
            return this.distSqrt - p2.distSqrt;
        }
    }

    public static void main(String[] args) {
        Q1 q1 = new Q1();
        int pts[][] = { { 3, 3 }, { 5, -1 }, { -2, 4 } };
        int k = 2;

        PriorityQueue<Points> p = new PriorityQueue<>();
        for (int i = 0; i < pts.length; i++) {
            int distSqrt = (pts[i][0] * pts[i][0]) + (pts[i][1] * pts[i][1]);
            p.add(q1.new Points(pts[i][0], pts[i][1], distSqrt));
        }

        for (int i = 0; i < k; i++) {
            Points point = p.peek();
            System.out.println("Point: (" + point.x + ", " + point.y + ")");
            p.remove();
        }
    }
}
