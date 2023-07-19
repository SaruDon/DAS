import java.util.*;;

public class bubble_sort {

    public static void bubbleSort(int number []) {
        for(int turns =0 ; turns < number.length-2 ;turns++){
            for(int j = 0 ;j<number.length-1-turns; j++){
                 if(number[j]> number[j+1]){
                    //Swap
                    int temp = number[j];
                    number[j] =number[j+1];
                    number[j+1] = temp;
                }
            }
        }
    }

    public static void printNumber(int number[]) {
        for(int i=0;i<number.length;i++){
            System.out.print(number[i]);
        }
        System.out.println();
    }

    public static void selectionSort(int number[]) {
        for (int i=0; i<number.length-1;i++){
            int minPos = i;
            for(int j=i+1; j<number.length;j++){
                if(number[minPos]>number[j]){
                    minPos = j;
                }
            }
            int temp = number[minPos];
            number[minPos]= number[i];
            number[i]= temp;
        }
    }
 public static void main(String[] args) {
    int number [] = {5,4,1,3,2};
    selectionSort(number);
    printNumber(number);
 }    
}
