

public class char_pattern {
   
    public static void main(String arg[]){

        char a = 'A';
        for(int line=1; line<=4; line++){
            for(int j=1; j<=line;j++){
                System.out.print(a);
                a++;
            }
            System.out.println();
        }
    }
}
