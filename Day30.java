public class Day30 {
    public static int secondLargest(int[] arr) {
        int n = arr.length;
        int max =0;
        int secondLarg= 0;
        for(int i =0; i <n; i++){
            //max = arr[i];
            if(arr[i]>max){ 
                secondLarg = max;
                max = arr[i];              
            }
            else if(arr[i]>secondLarg){
                secondLarg = arr[i];
            }
            
        }return secondLarg;
    }

    public static void main(String[] args){
        int[] ar = {10,5,8,20,15,18};
        System.out.println(secondLargest(ar));
    }
}
