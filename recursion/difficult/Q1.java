public class Q1 {
    
    public static void removeDup(String str, int si, int ei,StringBuilder sb,boolean map[]){
        if(si==ei){
            System.out.print(sb);
            return;
        }
        char ch = str.charAt(si);
        if(map[ch-'a'] == true){
            removeDup(str,si+1,ei,sb,map);
        }else{
            map[ch-'a']=true;
            removeDup(str,si+1,ei,sb.append(ch),map);
        }
    }


    public static void main(String[] args) {
        String str ="apnacollege";
        removeDup(str,0,str.length()-1,new StringBuilder(""),new boolean[25]);
    }
}
