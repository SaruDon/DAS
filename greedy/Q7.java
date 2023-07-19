import java.util.Arrays;
import java.util.Collections;

public class Q7 {
    public static void main(String[] args) {
        int n =4; 
        int m =6;
        Integer costver[] = {2,1,3,1,4};
        Integer costher[]={4,1,2};

        Arrays.sort(costher, Collections.reverseOrder());
        Arrays.sort(costver, Collections.reverseOrder());

        int h=0,v=0;
        int hp=1,vp=1;
        int cost =0;

        while (h < costher.length && v < costver.length) {
            if (costver[v] <= costher[h]) {
              cost += (costher[h]*vp); 
              hp++;
              h++; 
            }else{
                cost += (costver[v]*hp);
                vp++;
                v++;
            }
        }

        while (h < costher.length) {
                cost += (costher[h]*vp); 
                hp++;
                h++; 
        }
        while (v< costver.length) {
                cost += (costver[v]*hp);
                vp++;
                v++;
        }

        System.out.println( cost);
    }
}
