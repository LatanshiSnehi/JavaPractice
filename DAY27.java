import java.util.Arrays;

public class DAY27 {
    public static int[] day27(int[] nums){
       
        int n = nums.length;
        int[] ans = new int[n];
        for(int i =0; i<nums.length;i++){
             int product =1;
            for(int j =0; j < nums.length;j++){
                if(i!=j){
                    product = nums[j]*product;
                }
            }

            ans[i] = product;
        }
        return ans;
    }

       public static void main(String[] args){
            int[] arr ={1,2,3,4};
            System.out.println(Arrays.toString(day27(arr)));
        }
    }

