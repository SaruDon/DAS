import java.util.HashMap;
import java.util.Set;

public class Basic{

    
    
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>(0);    
        hm.put("India", 100);
        hm.put("Bhutan", 50);
        hm.put("China", 70);
        hm.put("USA", 200);


        System.out.println(hm);
        Set<String> keys = hm.keySet();
        System.out.println(keys);
    }
}