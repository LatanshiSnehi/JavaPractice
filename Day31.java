import java.util.Arrays;

public class Day31 {
    public static void moveZeroes(int[] arr){
        int pos =0;
        for(int i =0; i < arr.length;i++){
              if(arr[i] != 0){
                arr[pos] = arr[i];
                pos++;
                 arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args){
       int[] ar = {0,0,1,2,3};
       moveZeroes(ar);
        
    }
}
