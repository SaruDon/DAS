public class Compress {


    public static void compress(String str){
        StringBuilder sb = new StringBuilder("");
        int curr=1;
        for (int i = 1; i <= str.length(); i++) {
            if (str.charAt(i)==str.charAt(i-1) && i<str.length()-1) {
                curr++;
            }else{
                sb.append(str.charAt(i-1));
                sb.append(curr);
                System.out.print(sb);
                curr=1;
            }
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
        String str ="aaabbbccc";
        compress(str);
    }
}
