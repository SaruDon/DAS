public class duplicate {


    public static void removeDuplicate(String str , int indx,StringBuilder newStr,boolean map[]) {
        if(indx == str.length()){
            System.out.println(newStr);
            return;
        }
        //kaam
        char currChar = str.charAt(indx); 
        if(map[currChar-'a']==true){
            removeDuplicate(str, indx+1, newStr, map);
        }else{
            map[currChar-'a'] =true;
            removeDuplicate(str, indx+1, newStr.append(currChar), map);
        }
    }

    public static void main(String[] args) {
        String str ="appnnacollege";
        removeDuplicate(str, 0, new StringBuilder(""),new boolean[26]);
    }
}
