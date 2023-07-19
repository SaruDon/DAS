public class bubblesort {

    public static void sort(int nums[]) {
        for(int turn =0; turn<nums.length-1;turn++){
            for(int j=0;j<nums.length-1-turn;j++){
                if(nums[j]>nums[j+1]){
                    //swap
                    int temp = nums[j];
                    nums[j]= nums[j+1];
                    nums[j+1]=temp; 
                }
            }
        }
    }
      
    public static void selectionSort(int nums[]) {
        for (int i =0;i<nums.length-1;i++){
            int minPos =i;
            for(int j =i+1;j<nums.length;j++){
                if(nums[minPos]>nums[j]){
                    minPos=j;
                }
            }
            //swap
            int temp = nums[minPos];
            nums[minPos] = nums[i];
            nums[i] =temp;
        }
    }

    public static void Print(int nums[]) {
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]);
        }
    }

    public static void main(String[] args) {
        int nums [] ={5,4,1,3,2};
        //sort(nums);
        selectionSort(nums);
        Print(nums);
    }
}
