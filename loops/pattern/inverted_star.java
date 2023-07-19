
public class inverted_star {
    public static void main(String arg[]){
        for(int line=1; line<=4;line++){
            for(int star=4;line<=star;star--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


/*
  for(int line =1; line <=4;line++){
    for(star=1; star<=4-line+1;star++){
        System.out.print("*")
    }
    sout();
  }
 */