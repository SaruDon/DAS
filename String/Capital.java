public class Capital{
    public static void main(String[] args) {
        String str = "hi i am sarvesh";

        StringBuilder sb = new StringBuilder("");
        sb.append(Character.toUpperCase(str.charAt(0)));
        for (int j = 1; j < str.length(); j++) {
            // if (str.charAt(j)== ' ') {
            //     sb.append(" ");
            // }
            if (str.charAt(j-1)== ' ') {
                sb.append(Character.toUpperCase(str.charAt(j)));
            }else{
                sb.append(str.charAt(j));
            }
        }
        System.out.println(sb);
    }

   
}