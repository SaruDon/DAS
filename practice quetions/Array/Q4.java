import java.util.HashMap;
import java.util.LinkedHashMap;

public class Q4 {
    public static void main(String[] args) {
        String str = "aaaabbdd";


        // LinkedHashMap<Character,Integer>hm = new LinkedHashMap<>();
        // for (int i = 0; i < str.length(); i++) {
        //     hm.put(str.charAt(i),hm.getOrDefault(str.charAt(i),0)+1);
        // }

        // for (Character key : hm.keySet()) {
        //     System.out.println(key+" " +hm.get(key));
        // }
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count=1;
            while (i<str.length()-1 && ch == str.charAt(i+1)) {
                count++;
                i++;
            }
            if (count>1) {
                sb.append(ch+""+count);
            }
        }
        System.out.println(sb);
    }
}
