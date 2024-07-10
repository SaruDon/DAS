import java.sql.Time;
import java.util.ArrayList;
import java.util.Collections;

public class Q6 {
    
    public static class Job{
        public int deadline;
        public int profit;
        public int id;
        
        Job(int id ,int d, int p){
            this.id = id;
            profit = p;
            deadline =d;
        }
    }
    
    public static void main(String[] args) {
        int jobInfo [][] ={{4,20},{1,10},{1,40},{1,30}};
        

        ArrayList<Job> j = new ArrayList<>();
        for (int i = 0; i < jobInfo.length; i++) {
            j.add(new Job(i,jobInfo[i][0],jobInfo[i][1]));
        }

        Collections.sort(j, (a,b) -> b.profit-a.profit);
        int time =0;

        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < jobInfo.length; i++) {
            Job curr = j.get(i);
            if (curr.deadline>time) {
                ans.add(curr.id);
                time++;
            }
        }

        System.out.println(time);
        System.out.println(ans);

    }
}
