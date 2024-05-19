import java.util.ArrayList;
import java.util.Collections;

public class Main {
    
    public static String findLatestTime(String s) {
        StringBuilder sb = new StringBuilder(s);
        for(int i =0; i<4; i++){
            char ch = sb.charAt(i);
            if(ch != '?' || ch ==':'){
                continue;
            }
            else{
                if(i==0){
                    sb.setCharAt(0,'1');
                }
                else if(i==1){
                    if(sb.charAt(0)=='0'){
                        sb.setCharAt(1,'9');
                    }else{
                        sb.setCharAt(1,'1');
                    }
                }
                else if(i == 3){
                    sb.setCharAt(3,'5');
                }else if(i==4){
                    sb.setCharAt(4,'9');
                }
            }
        }
        return sb.toString();
    }
    public static int maximumPrimeDifference(int[] nums) {
        ArrayList<Integer>a = new ArrayList<>();
            for(int i =0; i<nums.length;i++){
                if(primeNo(nums[i])){
                    a.add(i);
                }
            }
            if(a.size()==0 || a.size()==1){
                return 0;
            }
            Collections.sort(a);
            return a.get(a.size()-1)- a.get(0);
    }

    

    public static int i =2;
    public static boolean primeNo(int n){
        if(n==i){
            return true;
        }
        if(n==0 ||n ==1){
            return false;
        }
        if(n%i==0){
            return false;
        }
        if(n==i){
            return true;
        }
        i++;
        return primeNo(n);
    }
    

    

    public static void main(String[] args) {
        // String str = "1?:?4";
        // System.out.println(findLatestTime(str));

        // System.out.println(primeNo(7));
         int arr[] ={4,2,9,5,3};
         System.out.println(maximumPrimeDifference(arr));
    }

}
