public class Q3 {
    public static void main(String[] args) {
        String str ="hi i am sarvesh";
        StringBuilder sb = new StringBuilder("");
        char ch = str.charAt(0);
        sb.append(Character.toUpperCase(ch));
        int i =1;
        while (i<=str.length()-1) {
            if (str.charAt(i)== ' ') {
                sb.append(str.charAt(i));
                sb.append(Character.toUpperCase(str.charAt(i+1)));
                i++;
            }else{
                sb.append(str.charAt(i));
            }
            i++;
        }
        System.out.println(sb);
    }
}
