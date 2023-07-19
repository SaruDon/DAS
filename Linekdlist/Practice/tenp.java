public class tenp {
    
    public static void print(String str){
        char ch = str.charAt(0);
        StringBuilder sb = new StringBuilder("");
        int curr=1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i)!=str.charAt(i-1)) {
                sb.append(str.charAt(i-1));
                sb.append(curr);
                System.out.println(sb);
                curr=1;
            }
            curr++;
        }
        System.out.println(sb);
    }
    
    public static void main(String[] args) {
        String str = "aaabbcc";
        print(str);
    }
}
