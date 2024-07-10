import java.util.*;
public class Q2{



    public static boolean cheack(String str1,String str2) {
        HashMap<Character,Integer> hm = new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {
            if (hm.containsKey(str1.charAt(i))) {
                hm.put(str1.charAt(i),hm.get(str1.charAt(i))+1);
            }else{
                 hm.put(str1.charAt(i),+1);
            }
        }


        for (int i = str2.length()-1; i >=0; i--) {
            char t = str2.charAt(i);
            if (hm.get(t) != null) {
                if (hm.get(t)==1) {
                    hm.remove(t);
                }else{
                    hm.put(t, hm.get(t)-1);
                }
            }else{
                return false;
            }       
        }

        return hm.isEmpty();
    }

    public static void main(String[] args) {
        String str1 ="race";
        String str2 = "care";
        

        System.out.println(cheack(str1, str2));
        
    }
}