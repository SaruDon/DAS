public class LenghtStr {

    public static int count(String str, int i){
        if (i==str.length()) {
            return i;
        }
        return count(str, i+1);
    }

    
    public static void main(String[] args) {
        String str = "abcd";
        System.out.println(count(str, 0));
    }
}
