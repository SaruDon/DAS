import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class star {
    Scanner sc =new Scanner(System.in);

    public static void main (String arg[]){
        for(int line =1; line<=4;line++){
            for(int star=1;star<=line;star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
